package by.teachmeskills.javaEEPatterns.dao;

import by.teachmeskills.javaEEPatterns.dao.domain.Student;
import by.teachmeskills.javaEEPatterns.dao.utils.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements IStudentDao {

    private static final String GET_ALL_STUDENTS = "select * from students";

    @Override
    public List<Student> getAllStudents() {
        List<Student> students;

        try (Connection connection = ConnectionPool.getInstance().getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_STUDENTS)) {
            students = new ArrayList<>();
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Student student = Student.builder().build();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setSurname(resultSet.getString("surname"));
                student.setCourse(resultSet.getInt("course"));
                students.add(student);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void deleteStudent(int id) {

    }
}

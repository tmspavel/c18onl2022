package by.teachmeskills.javaEEPatterns.dao;

import by.teachmeskills.javaEEPatterns.dao.domain.Student;
import java.util.List;

public interface IStudentDao {

    List<Student> getAllStudents();

    Student getStudentById(int id);

    void addStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(int id);
}

package by.teachmeskills.javaEEPatterns.dao;

import by.teachmeskills.javaEEPatterns.dao.domain.Student;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        System.out.println("All students: ");
        IStudentDao studentDao = new StudentDaoImpl();
        List<Student> students = studentDao.getAllStudents();
        students.forEach(System.out::println);
    }
}

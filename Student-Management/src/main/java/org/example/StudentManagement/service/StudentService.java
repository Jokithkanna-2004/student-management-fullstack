package org.example.StudentManagement.service;
import java.util.List;
import org.example.StudentManagement.entity.Student;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student createStudent(Student student);

    Student updateStudent(Long id, Student studentDetails);

    void deleteStudent(Long id);
}
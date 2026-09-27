package org.example.StudentManagement.Controller;

import java.util.List;

import org.example.StudentManagement.entity.Student;
import org.example.StudentManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // ✅ GET ALL STUDENTS
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // ✅ GET STUDENT BY ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    // ✅ CREATE STUDENT
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    // ✅ UPDATE STUDENT
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
        return studentService.updateStudent(id, studentDetails);
    }

    // ✅ DELETE STUDENT
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "Student deleted with id: " + id;
    }
}
//@RequestMapping("/students")
// public class Main{
//@Autowired
//private StudentRepositary studendentrepository;
//@GettMapping
// public List<Student> getAllStudent() {
//return studentrepository.save();
//}
//@GetMapping("/id")
//public Student grt(@Pathvariable ("id"),Long Id) {
//return studeb.gf(id);
//}
//@PostMapping() {
//public Student fr(@Requestbody Student studentd) {
//rteurn  studenre.save(student);
//@PutMapping("id")
//public Student fgfgf(@P Long id,@Rebodr stude 7btv) {
//Strufdrtbt  stu= stre.ss(Id)
//if
//student.setAge= 5sr6ttder.
//student.set//stufe.serhgqsvh = sty7.feuuhci9
//return srt.5sdav65e(s7r87yeyt)



//package org.example.StudentManagement.Controller;
//
//import java.util.List;
//
//
//import org.example.StudentManagement.Repository.StudentRepository;
//import org.example.StudentManagement.entity.Student;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/students")
//public class StudentController {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @GetMapping
//    public List<Student> getAllStudents() {
//        return studentRepository.findAll();
//    }
//
//    @GetMapping("/id")
//    public Student getStudentById(@RequestParam Long id) {
//        return studentRepository.findById(id).orElse(null);
//    }
//
//    @PostMapping
//    public Student createStudent(@RequestBody Student student) {
//        return studentRepository.save(student);
//    }
//
//    @PutMapping("/{id}")
//    public Student updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
//        Student student = studentRepository.findById(id).orElse(null);
//        if (student != null) {
//            student.setName(studentDetails.getName());
//            student.setEmail(studentDetails.getEmail());
//            student.setAge(studentDetails.getAge());
//            return studentRepository.save(student);
//        }
//        return null;
//    }
//
//    @DeleteMapping("/{id}")
//    public String deleteStudent(@PathVariable Long id) {
//        studentRepository.deleteById(id);
//        return "Student deleted with id: " + id;
//    }
//
//}

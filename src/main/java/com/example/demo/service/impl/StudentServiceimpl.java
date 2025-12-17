package com.example.demo.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRep;
    @Override
    public Student insertStudent(Student st) {
        return StudentRepo.save(st);
    }
    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
    // @Override
    // public List<Student> getAllStudents(){
    //     return studentRepository.findAll();
    // }
    @Override
    public Optional<Student> getOneStudent(Long id) {
        return studentRepo.findById(id);
    }
    @Override
    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }
}
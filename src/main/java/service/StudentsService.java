package service;

import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repozitory.StudentsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentsService {
    private StudentsRepository studentsRepository;

    @Autowired
    public StudentsService(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }
    public List<Student> findAll() {
        return studentsRepository.findAll();
    }
    public Optional<Student> findById(Long id) {
        return studentsRepository.findById(id);
    }
    public void deleteById(Long id) {
        studentsRepository.deleteById(id);
    }
}

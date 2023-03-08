package controller;

import entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import service.StudentsService;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentsController {

    private final  StudentsService studentsService;

    @GetMapping()
    private List<Student> findAll() {
        return studentsService.findAll();
    }

    @GetMapping("/{id}")
    private Optional<Optional<Student>> findById(@PathVariable Long id) {
        return Optional.of(studentsService.findById(id));
    }

    @DeleteMapping("/{id}")
    private void deleteById(@PathVariable Long id) {
       studentsService.deleteById(id);
    }
}
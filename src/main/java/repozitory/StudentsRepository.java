package repozitory;


import entity.Student;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public abstract class StudentsRepository implements StudentRepository {

    private List<Student> students;

    @Override
    public List<Student> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<Student> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }

}

package be.ucll.repository;

import be.ucll.model.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private List<Student> students;

    public StudentRepository() {
        students = new ArrayList<>();
    }

    public List<Student> getAllStudents() {
        return students;
    }
}

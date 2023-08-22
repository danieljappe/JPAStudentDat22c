package dk.kea.jpastudentdat22c.repository;

import dk.kea.jpastudentdat22c.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findAllByName(String name); //JPQL

}

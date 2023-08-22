package dk.kea.jpastudentdat22c.repository;

import dk.kea.jpastudentdat22c.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void findAllByName() {
        assertEquals(2, studentRepository.findAllByName("Frederik").size());
    }

    @Test
    void testOneTime(){
        List<Student> list = studentRepository.findAllByName("Frederik");
        assertEquals(2, list.size());
    }


}
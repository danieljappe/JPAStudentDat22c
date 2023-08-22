package dk.kea.jpastudentdat22c.config;

import dk.kea.jpastudentdat22c.model.Student;
import dk.kea.jpastudentdat22c.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

        //Student s1 = new Student("Frederik", LocalDate.of(1999, 1, 1), LocalTime.of(12, 15,35));

        Student s1 = new Student();
        s1.setName("Frederik");
        s1.setBornDate(LocalDate.of(1999, 1, 1));
        s1.setBornTime(LocalTime.of(12, 15,35));

        studentRepository.save(s1);

        Student s2 = new Student();
        s2.setName("Alice");
        s2.setBornDate(LocalDate.of(2000, 3, 18));
        s2.setBornTime(LocalTime.of(9, 30, 45));
        studentRepository.save(s2);

        Student s3 = new Student();
        s3.setName("Bob");
        s3.setBornDate(LocalDate.of(1998, 6, 5));
        s3.setBornTime(LocalTime.of(15, 10, 20));
        studentRepository.save(s3);

// Repeat the above code for each student you want to create

        Student s4 = new Student();
        s4.setName("Carol");
        s4.setBornDate(LocalDate.of(2001, 9, 12));
        s4.setBornTime(LocalTime.of(18, 45, 15));
        studentRepository.save(s4);

        Student s5 = new Student();
        s5.setName("David");
        s5.setBornDate(LocalDate.of(1997, 11, 23));
        s5.setBornTime(LocalTime.of(11, 25, 5));
        studentRepository.save(s5);

        Student s6 = new Student();
        s6.setName("Eva");
        s6.setBornDate(LocalDate.of(2002, 4, 7));
        s6.setBornTime(LocalTime.of(14, 5, 30));
        studentRepository.save(s6);

        Student s7 = new Student();
        s7.setName("Frederik");
        s7.setBornDate(LocalDate.of(1996, 8, 15));
        s7.setBornTime(LocalTime.of(20, 0, 0));
        studentRepository.save(s7);

        Student s8 = new Student();
        s8.setName("Grace");
        s8.setBornDate(LocalDate.of(2003, 10, 30));
        s8.setBornTime(LocalTime.of(10, 20, 10));
        studentRepository.save(s8);

        Student s9 = new Student();
        s9.setName("Henry");
        s9.setBornDate(LocalDate.of(1995, 12, 10));
        s9.setBornTime(LocalTime.of(16, 40, 25));
        studentRepository.save(s9);

    }
}

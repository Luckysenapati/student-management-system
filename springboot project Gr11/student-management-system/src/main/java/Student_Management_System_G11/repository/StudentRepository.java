package Student_Management_System_G11.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Student_Management_System_G11.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}

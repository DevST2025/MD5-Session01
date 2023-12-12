package ra.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.academy.model.Student;

public interface IStudentRepository extends JpaRepository<Student, String> {
}

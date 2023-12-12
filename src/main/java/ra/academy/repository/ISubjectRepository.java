package ra.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.academy.model.Subject;

public interface ISubjectRepository extends JpaRepository<Subject, String> {
}

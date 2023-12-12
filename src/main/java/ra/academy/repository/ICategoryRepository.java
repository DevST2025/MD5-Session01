package ra.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.academy.model.Category;

public interface ICategoryRepository extends JpaRepository<Category, Long> {
}

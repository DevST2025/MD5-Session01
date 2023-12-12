package ra.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.academy.model.Book;

public interface IBookRepository extends JpaRepository<Book, Long> {
}

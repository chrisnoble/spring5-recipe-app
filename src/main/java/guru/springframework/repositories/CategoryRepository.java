package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository<U, L extends Number> extends CrudRepository<Category, Long> {
}

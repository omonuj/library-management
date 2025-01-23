package brightlogic.library.repository;

import brightlogic.library.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PublisherRepository extends JpaRepository<Publisher, Integer> {
}

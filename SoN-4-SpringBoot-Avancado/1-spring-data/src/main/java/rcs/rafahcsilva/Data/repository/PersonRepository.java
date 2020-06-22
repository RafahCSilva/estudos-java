package rcs.rafahcsilva.Data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rcs.rafahcsilva.Data.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}

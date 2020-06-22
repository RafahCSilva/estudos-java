package rcs.rafahcsilva.Data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rcs.rafahcsilva.Data.models.Person;

@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
}

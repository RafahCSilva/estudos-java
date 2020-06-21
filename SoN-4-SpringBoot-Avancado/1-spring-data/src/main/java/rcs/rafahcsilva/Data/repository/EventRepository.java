package rcs.rafahcsilva.Data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rcs.rafahcsilva.Data.models.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
}

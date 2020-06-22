package rcs.rafahcsilva.Data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rcs.rafahcsilva.Data.models.Event;

@Repository
public interface EventRepository extends PagingAndSortingRepository<Event, Long> {
}

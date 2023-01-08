package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.UserIp;

@Repository
public interface FlightRepo extends CrudRepository<UserIp, Long> {

}

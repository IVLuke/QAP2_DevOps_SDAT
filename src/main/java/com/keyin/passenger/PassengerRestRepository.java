package com.keyin.passenger;

import com.keyin.aircraft.Aircraft;
import com.keyin.passenger.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "passenger_repo", path = "passenger_repo")
public interface PassengerRestRepository extends JpaRepository<Passenger, Long> {

}

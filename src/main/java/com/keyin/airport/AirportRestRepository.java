package com.keyin.airport;

import com.keyin.aircraft.Aircraft;
import com.keyin.airport.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "airport_repo", path = "airport_repo")
public interface AirportRestRepository extends JpaRepository<Airport, Long> {
}

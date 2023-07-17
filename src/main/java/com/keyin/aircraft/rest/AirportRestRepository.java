package com.keyin.aircraft.rest;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "aircraft_repo", path = "aircraft_repo")

public interface AirportRestRepository {
}

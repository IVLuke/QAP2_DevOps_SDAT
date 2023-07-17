package com.keyin.airport.rest;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "airport_repo", path = "airport_repo")
public interface AirportRestRepository {
}

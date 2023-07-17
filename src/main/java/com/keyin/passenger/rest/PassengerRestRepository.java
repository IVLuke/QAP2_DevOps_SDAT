package com.keyin.passenger.rest;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "passenger_repo", path = "passenger_repo")
public interface PassengerRestRepository {
}

package com.keyin.city.rest;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "city_repo", path = "city_repo")
public interface CityRestRepository {

}

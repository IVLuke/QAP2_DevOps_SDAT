package com.keyin.city;

import com.keyin.aircraft.Aircraft;
import com.keyin.city.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "city_repo", path = "city_repo")
public interface CityRestRepository extends JpaRepository<City, Long> {

}

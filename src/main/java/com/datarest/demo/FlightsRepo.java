package com.datarest.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.datarest.demo.model.Flights;

@RepositoryRestResource(collectionResourceRel = "flights", path="flights")
public interface FlightsRepo extends JpaRepository<Flights, String>{

}

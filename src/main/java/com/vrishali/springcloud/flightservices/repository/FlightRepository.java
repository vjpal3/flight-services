package com.vrishali.springcloud.flightservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrishali.springcloud.flightservices.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}

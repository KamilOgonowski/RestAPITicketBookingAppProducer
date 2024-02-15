package com.kamil.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kamil.pojo.Passenger;

public interface ITicketRepo extends JpaRepository<Passenger, Integer>{

}

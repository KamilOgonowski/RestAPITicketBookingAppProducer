package com.kamil.service;

import com.kamil.pojo.Passenger;

public interface ITicketBookingService {
	
	public Passenger registerPassenger(Passenger passenger);
	public Passenger getPassengerInfo(Integer pid);

}

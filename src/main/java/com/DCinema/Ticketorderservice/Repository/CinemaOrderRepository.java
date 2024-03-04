package com.DCinema.Ticketorderservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DCinema.Ticketorderservice.Entity.CinemaOrder;

public interface CinemaOrderRepository extends JpaRepository<CinemaOrder, Integer> {

}

package com.bibliotheque.microservicemylibrary.dao;

import com.bibliotheque.microservicemylibrary.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationDao extends JpaRepository<Reservation, Long> {
}

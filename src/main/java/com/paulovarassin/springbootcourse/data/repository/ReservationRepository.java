package com.paulovarassin.springbootcourse.data.repository;

import com.paulovarassin.springbootcourse.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {

}

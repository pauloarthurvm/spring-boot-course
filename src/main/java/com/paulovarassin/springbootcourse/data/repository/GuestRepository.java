package com.paulovarassin.springbootcourse.data.repository;

import com.paulovarassin.springbootcourse.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}

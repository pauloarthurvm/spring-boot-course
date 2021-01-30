package com.paulovarassin.springbootcourse;

import com.paulovarassin.springbootcourse.data.entity.Guest;
import com.paulovarassin.springbootcourse.data.entity.Reservation;
import com.paulovarassin.springbootcourse.data.entity.Room;
import com.paulovarassin.springbootcourse.data.repository.GuestRepository;
import com.paulovarassin.springbootcourse.data.repository.ReservationRepository;
import com.paulovarassin.springbootcourse.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCourseApplication.class, args);
    }


}

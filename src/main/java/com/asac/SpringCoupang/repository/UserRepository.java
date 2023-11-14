package com.asac.SpringCoupang.repository;

import com.asac.SpringCoupang.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUseremail(String useremail);
}

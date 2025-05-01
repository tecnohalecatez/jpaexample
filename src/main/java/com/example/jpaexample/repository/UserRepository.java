package com.example.jpaexample.repository;

import com.example.jpaexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

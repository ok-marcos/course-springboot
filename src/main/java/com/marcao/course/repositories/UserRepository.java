package com.marcao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcao.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

package com.adventuresquad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adventuresquad.model.User;


public interface UserRepository  extends JpaRepository<User, Integer> {



}

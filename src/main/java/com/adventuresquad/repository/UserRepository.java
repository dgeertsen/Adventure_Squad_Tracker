package com.adventuresquad.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.adventuresquad.model.User;


public interface UserRepository  extends JpaRepository<User, Integer> {



}

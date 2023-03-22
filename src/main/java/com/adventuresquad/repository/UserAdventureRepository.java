package com.adventuresquad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.adventuresquad.model.UserAdventure;

@Repository
public interface UserAdventureRepository  extends JpaRepository<UserAdventure, Integer> {



}

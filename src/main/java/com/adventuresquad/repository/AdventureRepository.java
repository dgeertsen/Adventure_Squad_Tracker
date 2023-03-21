package com.adventuresquad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adventuresquad.model.Adventure;


public interface AdventureRepository  extends JpaRepository<Adventure, Integer> {



}

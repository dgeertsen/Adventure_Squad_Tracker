package com.adventuresquad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adventuresquad.model.Location;


public interface LocationRepository  extends JpaRepository<Location, Integer> {



}

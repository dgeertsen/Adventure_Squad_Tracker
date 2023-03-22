package com.adventuresquad.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adventuresquad.exception.AdventureException;
import com.adventuresquad.model.Adventure;
import com.adventuresquad.repository.AdventureRepository;


@Service
public class AdventureServiceImplemented implements AdventureService {
  private AdventureRepository adventureRepository;
  
  @Autowired
  public AdventureServiceImplemented(AdventureRepository adventureRepository)
  {
    this.adventureRepository=adventureRepository;
  }
  

  //Get all adventure's
  @Override
  public List<Adventure> getAllAdventures() {
    
    return adventureRepository.findAll();
  }
  
  
  //Create a new adventure
  @Override
  public Adventure saveAdventure(Adventure adventure) {
    return adventureRepository.save(adventure);

  }

  //Modify an exising adventure
  @Override
  public Adventure updateAdventure(Adventure adventure, int Id) {
    Adventure existingAdventure = adventureRepository.findById(Id).orElseThrow(() -> new AdventureException("Adventure", "Id", Id));
    
    existingAdventure.setLocation_id(adventure.getLocation_id());
    existingAdventure.setStart_date(adventure.getStart_date());
    existingAdventure.setEnd_date(adventure.getEnd_date());
    
    adventureRepository.save(existingAdventure);
    
    return existingAdventure;
  }

  
}

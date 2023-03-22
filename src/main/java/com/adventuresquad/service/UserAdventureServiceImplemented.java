package com.adventuresquad.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adventuresquad.model.UserAdventure;
import com.adventuresquad.repository.UserAdventureRepository;


@Service
public class UserAdventureServiceImplemented implements UserAdventureService {
  private UserAdventureRepository userAdventureRepository;
  
  @Autowired
  public UserAdventureServiceImplemented(UserAdventureRepository userAdventureRepository)
  {
    this.userAdventureRepository=userAdventureRepository;
  }

  @Override
  public List<UserAdventure> getAllUserAdventures() {
    return userAdventureRepository.findAll();
  }


  @Override
  public UserAdventure updateUserAdventure(UserAdventure userAdventure, int Id) {
    // TODO Auto-generated method stub
    return null;
  }




  



  
}

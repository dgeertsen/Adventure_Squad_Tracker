package com.adventuresquad.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adventuresquad.exception.UserException;
import com.adventuresquad.model.User;
import com.adventuresquad.repository.UserRepository;

@Service
public class UserServiceImplemented implements UserService {
  private UserRepository userRepository;
  
  @Autowired
  public UserServiceImplemented(UserRepository userRepository)
  {
    this.userRepository=userRepository;
  }
  
  //Get all users
  @Override
  public List<User> getAllUsers() {
      return userRepository.findAll();
  }

  //Get a user by Specific id
  @Override
  public User getUserById(int id) {
      return userRepository.findById(id).orElseThrow(() -> new UserException("User", "Id", id));
  }
  //Create a new user
  @Override
  public User saveUser(User player) {
      return userRepository.save(player);
  }

  
  //Modify an exist user
  @Override
  public User updateUser(User player, int Id) {
      User existingUser = userRepository.findById(Id).orElseThrow(() -> new UserException("User", "Id", Id));
      
      existingUser.setFirst_name(player.getFirst_name());
      existingUser.setLast_name(player.getLast_name());
      existingUser.setAge(player.getAge());
      
      return existingUser;
  }

  //Delete a user
  public void deleteUser(int Id) {
      User existingUser = userRepository.findById(Id).orElseThrow(() -> new UserException("User", "Id", Id));
      userRepository.deleteById(Id);
  }

  
}

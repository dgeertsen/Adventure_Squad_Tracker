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
  public UserServiceImplemented(UserRepository userRepository) {
    super();
    this.userRepository = userRepository;
  }

  // Get all users
  @Override
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  // Get a user by Specific id
  @Override
  public User getUserById(int id) {
    return userRepository.findById(id).orElseThrow(() -> new UserException("User", "Id", id));
  }

  // Create a new user
  @Override
  public User saveUser(User user) {
    return userRepository.save(user);
  }


  // Modify an existing user
  @Override
  public User updateUser(User user, int id) {
    User existingUser =
        userRepository.findById(id).orElseThrow(() -> new UserException("User", "Id", id));

    existingUser.setFirst_name(user.getFirst_name());
    existingUser.setLast_name(user.getLast_name());
    existingUser.setAge(user.getAge());

    userRepository.save(existingUser);
    return existingUser;
  }

  // Delete a user
  public void deleteUser(int id) {
    User existingUser =
        userRepository.findById(id).orElseThrow(() -> new UserException("User", "Id", id));
    userRepository.delete(existingUser);
  }


}

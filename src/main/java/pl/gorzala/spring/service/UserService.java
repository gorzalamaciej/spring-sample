package pl.gorzala.spring.service;

import pl.gorzala.spring.type.request.UserRequest;
import pl.gorzala.spring.type.response.UserResponse;

public interface UserService {

  UserResponse findUser(String name);

  void addUser(UserRequest request);
}

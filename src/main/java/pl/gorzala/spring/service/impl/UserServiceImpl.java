package pl.gorzala.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.gorzala.spring.data.dao.UserDao;
import pl.gorzala.spring.data.dto.User;
import pl.gorzala.spring.service.UserService;
import pl.gorzala.spring.type.request.UserRequest;
import pl.gorzala.spring.type.response.UserResponse;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao userDao;

  @Override
  public UserResponse findUser(String name) {
    User user = userDao.findByUserName(name);
    return new UserResponse(user);
  }

  @Override
  @Transactional
  public void addUser(UserRequest request) {
    User user = new User();
    user.setActivated(request.isActivated());
    user.setEmail(request.getEmail());
    user.setPassword(request.getPassword());
    user.setUsername(request.getUsername());
    userDao.saveOrUpdate(user);
  }
}

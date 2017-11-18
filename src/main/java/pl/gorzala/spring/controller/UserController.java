package pl.gorzala.spring.controller;

import java.io.IOException;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.gorzala.spring.service.UserService;
import pl.gorzala.spring.type.request.UserRequest;
import pl.gorzala.spring.type.response.GenericResponse;
import pl.gorzala.spring.type.response.UserResponse;

@Controller
@RequestMapping("/user")
public class UserController {

  private static final Logger logger = LoggerFactory.getLogger(UserController.class);

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/get", method = RequestMethod.GET)
  @ResponseBody
  public UserResponse sayHello(String username) {
    return userService.findUser(username);
  }

  @RequestMapping(value = "/add", method = RequestMethod.POST)
  public @ResponseBody
  GenericResponse getAccounts(@Valid @RequestBody UserRequest request) throws IOException {
    logger.info("/user/add request: {}", request);
    userService.addUser(request);
    return new GenericResponse();
  }
}

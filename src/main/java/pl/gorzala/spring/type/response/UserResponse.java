package pl.gorzala.spring.type.response;

import pl.gorzala.spring.data.dto.User;

public class UserResponse {
  private long id;
  private String username;
  private String password;
  private String email;
  private boolean activated;

  public UserResponse() {
  }

  public UserResponse(User user) {
    this.id = user.getId();
    this.username = user.getUsername();
    this.password = user.getPassword();
    this.email = user.getEmail();
    this.activated = user.isActivated();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public boolean isActivated() {
    return activated;
  }

  public void setActivated(boolean activated) {
    this.activated = activated;
  }

  @Override
  public String toString() {
    return "UserResponse{" +
      "id=" + id +
      ", username='" + username + '\'' +
      ", password='" + password + '\'' +
      ", email='" + email + '\'' +
      ", activated=" + activated +
      '}';
  }
}

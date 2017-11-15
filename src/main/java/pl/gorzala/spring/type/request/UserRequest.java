package pl.gorzala.spring.type.request;

public class UserRequest {

  private String username;
  private String password;
  private String email;
  private boolean activated;
  private String activationKey;
  private String resetPasswordKey;

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

  public String getActivationKey() {
    return activationKey;
  }

  public void setActivationKey(String activationKey) {
    this.activationKey = activationKey;
  }

  public String getResetPasswordKey() {
    return resetPasswordKey;
  }

  public void setResetPasswordKey(String resetPasswordKey) {
    this.resetPasswordKey = resetPasswordKey;
  }

  @Override
  public String toString() {
    return "UserRequest{" +
      "username='" + username + '\'' +
      ", password='" + password + '\'' +
      ", email='" + email + '\'' +
      ", activated=" + activated +
      ", activationKey='" + activationKey + '\'' +
      ", resetPasswordKey='" + resetPasswordKey + '\'' +
      '}';
  }
}

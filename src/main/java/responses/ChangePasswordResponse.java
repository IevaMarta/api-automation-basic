package responses;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ChangePasswordResponse {
  private Integer id;
  private String username;
  private String email;
  private String password;
  private String customer;
  private String deluxeToken;
  private String lastLoginIp;
  private String profileImage;
  private String totpSecret;
  private boolean isActive;
  private String createdAt;
  private String updatedAt;
  private String deletedAt;

  public ChangePasswordResponse() {
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getCustomer() {
    return this.customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public String getDeluxeToken() {
    return this.deluxeToken;
  }

  public void setDeluxeToken(String deluxeToken) {
    this.deluxeToken = deluxeToken;
  }

  public String getLastLoginIp() {
    return this.lastLoginIp;
  }

  public void setLastLoginIp(String lastLoginIp) {
    this.lastLoginIp = lastLoginIp;
  }

  public String getProfileImage() {
    return this.profileImage;
  }

  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

  public String getTotpSecret() {
    return this.totpSecret;
  }

  public void setTotpSecret(String totpSecret) {
    this.totpSecret = totpSecret;
  }

  public boolean getIsActive() {
    return this.isActive;
  }

  public void setIsActive(boolean isActive) {
    this.isActive = isActive;
  }

  public String getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getUpdatedAt() {
    return this.updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getDeletedAt() {
    return this.deletedAt;
  }

  public void setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
  }

  // Methods
  @JsonProperty("user")
  private void unpackData(Map<String, Object> data) {
    setId((Integer) data.get("id"));
    setUsername((String) data.get("username"));
    setEmail((String) data.get("email"));
    setPassword((String) data.get("password"));
    setCustomer((String) data.get("customer"));
    setDeluxeToken((String) data.get("deluxeToken"));
    setLastLoginIp((String) data.get("lastLoginIp"));
    setProfileImage((String) data.get("profileImage"));
    setTotpSecret((String) data.get("totpSecret"));
    setIsActive((boolean) data.get("isActive"));
    setCreatedAt((String) data.get("createdAt"));
    setUpdatedAt((String) data.get("updatedAt"));
    setDeletedAt((String) data.get("deletedAt"));
  }
}
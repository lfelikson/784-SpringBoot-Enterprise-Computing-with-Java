package com.example.demo.dtos;

public class LoginResponseDto {

  private String token; 
  private long expiresIn;

  public String getToken() {
    return token;
  }

  public LoginResponseDto setToken(String token) {
    this.token = token;
    return this;
  }

  public long getExpiresIn() {
    return expiresIn;
  }

  public LoginResponseDto setExpiresIn(long expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  @Override
  public String toString() {
    return (
      "LoginResponseDto{" +
      "token='" +
      token +
      '\'' +
      ", expiresIn=" +
      expiresIn +
      '}'
    );
  }
}
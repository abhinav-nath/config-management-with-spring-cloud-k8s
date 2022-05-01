package com.codecafe.springcloudk8s;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ConfigManagementWithSpringCloudK8sApplication {

  @Value("${app.message}")
  private String message;

  public static void main(String[] args) {
    SpringApplication.run(ConfigManagementWithSpringCloudK8sApplication.class, args);
  }

  @GetMapping("")
  public String helloWorld() {
    return "Hello from " + message;
  }

}
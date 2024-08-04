package com.uichesoh.microservices.core.recommendation;

import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.MongoDBContainer;

public abstract class MongoDbTestBase {

  
  private static MongoDBContainer database = new MongoDBContainer("mongo:6.0.4");

  static {
    database.start();
  }

}

package com.learnspringbootsmongodb.demoAppMongodb.repository;

import com.learnspringbootsmongodb.demoAppMongodb.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, String> {}

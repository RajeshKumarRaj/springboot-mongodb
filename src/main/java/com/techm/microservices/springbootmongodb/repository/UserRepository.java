package com.techm.microservices.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.techm.microservices.springbootmongodb.document.Users;

public interface UserRepository extends MongoRepository<Users, Integer> {

}

package com.miguelbarrios.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.miguelbarrios.data.User;

public interface UserRepository extends MongoRepository<User, String> {

}

package com.miguelbarrios.codesnippetapp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.miguelbarrios.codesnippetapp.entities.User;

public interface UserRepository extends MongoRepository<User, String> {

}

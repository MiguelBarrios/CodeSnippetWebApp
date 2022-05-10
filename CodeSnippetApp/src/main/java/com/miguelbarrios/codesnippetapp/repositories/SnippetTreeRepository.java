package com.miguelbarrios.codesnippetapp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.miguelbarrios.codesnippetapp.entities.SnippetTree;

public interface SnippetTreeRepository extends MongoRepository<SnippetTree, String> {

}

package com.miguelbarrios.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.miguelbarrios.entities.SnippetTree;

public interface SnippetTreeRepository extends MongoRepository<SnippetTree, String> {

}

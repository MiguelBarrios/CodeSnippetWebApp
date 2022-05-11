package com.miguelbarrios.codesnippetapp.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.miguelbarrios.codesnippetapp.entities.SnippetTree;

public interface SnippetTreeRepository extends MongoRepository<SnippetTree, String> {
	List<SnippetTree> findByUsername(String username);
}

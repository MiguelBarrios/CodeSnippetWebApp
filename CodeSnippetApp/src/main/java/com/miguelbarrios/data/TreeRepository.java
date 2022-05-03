package com.miguelbarrios.data;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TreeRepository extends MongoRepository<TreeItem, String> {
	

}

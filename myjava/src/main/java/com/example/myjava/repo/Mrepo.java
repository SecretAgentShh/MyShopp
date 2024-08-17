package com.example.myjava.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.myjava.model.PasswordChange;

public interface Mrepo extends MongoRepository<PasswordChange, String>{

}

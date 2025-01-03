package com.example.practice.repository;

import com.example.practice.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository
@Component
public interface userRepository extends MongoRepository<User,Long> {

}

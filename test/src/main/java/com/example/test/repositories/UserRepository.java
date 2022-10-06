package com.example.test.repositories;


import com.example.test.repositories.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GenericRepository<User,Long>{
}

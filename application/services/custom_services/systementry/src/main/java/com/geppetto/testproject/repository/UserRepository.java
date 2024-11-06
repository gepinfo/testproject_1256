package com.geppetto.testproject.repository;

import com.geppetto.testproject.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Repository
public interface UserRepository extends MongoRepository<User,String>  {
    
    Page<User> findAll(Pageable pageable);

}

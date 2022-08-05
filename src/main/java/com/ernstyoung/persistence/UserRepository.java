package com.ernstyoung.persistence;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.ernstyoung.model.User;

public interface UserRepository extends CrudRepository<User, UUID> {
    List<User> findByName(String name);

    List<User> findByEmail(String email);
}

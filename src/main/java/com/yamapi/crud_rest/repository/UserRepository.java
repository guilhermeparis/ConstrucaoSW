package com.yamapi.crud_rest.repository;

import com.yamapi.crud_rest.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/users")
public interface UserRepository extends JpaRepository<User, String> {

}
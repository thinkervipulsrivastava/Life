package com.daily.status.SpringBootSecurityWithMySql.repository;

import com.daily.status.SpringBootSecurityWithMySql.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByName (String username);
}

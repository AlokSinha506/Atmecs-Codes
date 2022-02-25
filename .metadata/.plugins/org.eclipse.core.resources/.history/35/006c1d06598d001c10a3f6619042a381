package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import java.util.Optional;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Role;
@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
 Optional<Role> findByRole(String role);
}

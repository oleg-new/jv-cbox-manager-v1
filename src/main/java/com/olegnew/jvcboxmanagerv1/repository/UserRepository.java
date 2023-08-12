package com.olegnew.jvcboxmanagerv1.repository;

import com.olegnew.jvcboxmanagerv1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String username);

}

package com.olegnew.jvcboxmanagerv1.service;

import com.olegnew.jvcboxmanagerv1.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User getByName(String name);

    List<User> getAllusers();

    Optional<User> getById(Long id);

    User add(User user);

    User update(User user);

    void delete(Long id);

}

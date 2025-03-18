package me.dio.santander_dev_weak.service;

import me.dio.santander_dev_weak.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);

}

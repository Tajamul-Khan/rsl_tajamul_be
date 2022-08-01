package com.rsl_tajamul_be.rsl_tajamul_be.Services;

import com.rsl_tajamul_be.rsl_tajamul_be.Entity.User;

import java.util.ArrayList;

public interface UserService {
    User saveUser(User user);

    ArrayList<User> getUser();

    User getUserById(Long userId);

    void deleteUser(Long userId);

    User updateUser(Long userId, User user);
}

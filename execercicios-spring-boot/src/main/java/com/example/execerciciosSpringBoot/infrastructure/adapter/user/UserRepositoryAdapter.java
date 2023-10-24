package com.example.execerciciosSpringBoot.infrastructure.adapter.user;

import com.example.execerciciosSpringBoot.core.domain.user.entity.User;
import com.example.execerciciosSpringBoot.core.domain.user.port.UserRepositoryPort;

import java.util.List;

public class UserRepositoryAdapter implements UserRepositoryPort {
    @Override
    public User save(User object) {
        return null;
    }

    @Override
    public User edit(Long id, User object) {
        return null;
    }

    @Override
    public User getOne(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<User> getAll() {
        return null;
    }
}

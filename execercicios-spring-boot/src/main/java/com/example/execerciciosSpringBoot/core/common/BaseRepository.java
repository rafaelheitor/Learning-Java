package com.example.execerciciosSpringBoot.core.common;

import java.util.List;

public interface BaseRepository<T> {
    T save(T object);
    T edit(Long id, T object);
    T getOne(Long id);
    void delete(Long id);
    List<T> getAll();

}

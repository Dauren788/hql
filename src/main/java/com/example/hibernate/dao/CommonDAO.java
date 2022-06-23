package com.example.hibernate.dao;

/*

основные операции для всех entity-объектов
CRUD - Create, Read, Update, Delete
общий поиск данных

 */

import java.util.List;

public interface CommonDAO<T> {

    // получить абсолютно все значения
    List<T> findAll();

    // получить все значения по значению почты
    List<T> findAll(String email);

    // получить одно значение по id
    T get(long id);

    // обновить значение
    void update(T obj);

    // удалить значение по id
    void delete(long id);

    // добавить значение
    void add(T obj);

}


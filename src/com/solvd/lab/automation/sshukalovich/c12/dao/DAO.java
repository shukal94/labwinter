package com.solvd.lab.automation.sshukalovich.c12.dao;

import com.solvd.lab.automation.sshukalovich.c12.domain.interfaces.UIComponent;

import java.util.List;

public interface DAO<T extends UIComponent> {
    T create(T o);
    T getById(Long id);
    List<T> get();
    T update(T o);
    Long deleteById(Long id);

}

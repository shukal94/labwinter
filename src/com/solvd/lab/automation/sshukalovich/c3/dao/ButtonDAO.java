package com.solvd.lab.automation.sshukalovich.c3.dao;

import com.solvd.lab.automation.sshukalovich.c3.model.button.AbstractButton;
import com.solvd.lab.automation.sshukalovich.c3.model.button.Button;

import java.util.List;

public interface ButtonDAO {
    Button create(Button o);
    Button getById(Long id);
    List<Button> get();
    Button update(Button o);
    Long deleteById(Long id);
}

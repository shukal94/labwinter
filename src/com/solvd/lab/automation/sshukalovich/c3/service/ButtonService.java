package com.solvd.lab.automation.sshukalovich.c3.service;

import com.solvd.lab.automation.sshukalovich.c3.dao.ButtonDAO;
import com.solvd.lab.automation.sshukalovich.c3.dao.impl.mock.ButtonDAOImpl;
import com.solvd.lab.automation.sshukalovich.c3.model.button.Button;

import java.util.List;

public class ButtonService {
    private static final ButtonDAO DAO = ButtonDAOImpl.getInstance();

    public static Button createButton(Button o) {
        return DAO.create(o);
    }

    public static Button getButtonById(Long id) {
        return DAO.getById(id);
    }

    public static List<Button> get() {
        return DAO.get();
    }

    public static Button update(Button o) {
        return DAO.update(o);
    }

    public static Long deleteById(Long id) {
        return DAO.deleteById(id);
    }
}

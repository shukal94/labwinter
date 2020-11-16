package com.solvd.lab.automation.sshukalovich.c12.service;

import com.solvd.lab.automation.sshukalovich.c12.dao.InputDAO;
import com.solvd.lab.automation.sshukalovich.c12.dao.impl.mock.InputDAOImpl;
import com.solvd.lab.automation.sshukalovich.c12.domain.interfaces.InputField;

import java.util.List;

public class InputService {
    private static final InputDAO INPUT_DAO = new InputDAOImpl();

    public static InputField create(InputField o) {
        return INPUT_DAO.create(o);
    }

    public static InputField getById(Long id) {
        return INPUT_DAO.getById(id);
    }

    public static List<InputField> get() {
        return INPUT_DAO.get();
    }

    public static InputField update(InputField o) {
        return INPUT_DAO.update(o);
    }

    public static Long deleteById(Long id) {
        return INPUT_DAO.deleteById(id);
    }
}

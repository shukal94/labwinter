package com.solvd.lab.automation.sshukalovich.c12.service;

import com.solvd.lab.automation.sshukalovich.c12.dao.RadioButtonDAO;
import com.solvd.lab.automation.sshukalovich.c12.dao.impl.mock.RadioButtonDAOImpl;
import com.solvd.lab.automation.sshukalovich.c12.domain.interfaces.RadioButton;

import java.util.List;

public class RadioButtonService {
    private static final RadioButtonDAO RADIO_BUTTON_DAO = new RadioButtonDAOImpl();

    public static RadioButton create(RadioButton o) {
        return RADIO_BUTTON_DAO.create(o);
    }

    public static RadioButton getById(Long id) {
        return RADIO_BUTTON_DAO.getById(id);
    }

    public static List<RadioButton> get() {
        return RADIO_BUTTON_DAO.get();
    }

    public static RadioButton update(RadioButton o) {
        return RADIO_BUTTON_DAO.update(o);
    }

    public static Long deleteById(Long id) {
        return RADIO_BUTTON_DAO.deleteById(id);
    }
}

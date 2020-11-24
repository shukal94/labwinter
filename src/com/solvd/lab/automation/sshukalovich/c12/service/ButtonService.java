package com.solvd.lab.automation.sshukalovich.c12.service;

import com.solvd.lab.automation.sshukalovich.c12.constant.PropertyConstant;
import com.solvd.lab.automation.sshukalovich.c12.dao.ButtonDAO;
import com.solvd.lab.automation.sshukalovich.c12.domain.interfaces.Button;

import java.util.List;

public class ButtonService extends BaseService{

    private static final ButtonDAO BUTTON_DAO = BUTTON_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

    public static Button create(Button b) {
        return BUTTON_DAO.create(b);
    }

    public static Button getById(Long id) {
        return BUTTON_DAO.getById(id);
    }

    public static List<Button> get() {
        return BUTTON_DAO.get();
    }

    public static Button update(Button o) {
        return BUTTON_DAO.update(o);
    }

    public static Long deleteById(Long id) {
        return BUTTON_DAO.deleteById(id);
    }
}

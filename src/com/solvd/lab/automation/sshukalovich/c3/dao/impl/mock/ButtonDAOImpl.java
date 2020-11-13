package com.solvd.lab.automation.sshukalovich.c3.dao.impl.mock;

import com.solvd.lab.automation.sshukalovich.c3.constant.ProjectConstant;
import com.solvd.lab.automation.sshukalovich.c3.dao.ButtonDAO;
import com.solvd.lab.automation.sshukalovich.c3.exceptions.NotImplementException;
import com.solvd.lab.automation.sshukalovich.c3.model.button.Button;

import java.util.List;

public class ButtonDAOImpl implements ButtonDAO {

    private static ButtonDAOImpl inst;

    public static synchronized ButtonDAOImpl getInstance() {
        if (inst == null) {
            inst = new ButtonDAOImpl();
        }
        return inst;
    }

    private ButtonDAOImpl() {

    }

    @Override
    public Button create(Button o) {
        return new Button(
                o.getName(),
                o.getCoordinates(),
                o.getText(),
                o.getWidth(),
                o.getHeigth(),
                o.getColor()
        );
    }

    @Override
    public Button getById(Long id) {
        throw new NotImplementException(String.format(ProjectConstant.NOT_IMPLEMENTED_TEMPLATE, "getById"));
    }

    @Override
    public List<Button> get() {
        throw new NotImplementException(String.format(ProjectConstant.NOT_IMPLEMENTED_TEMPLATE, "get"));
    }

    @Override
    public Button update(Button o) {
        return new Button(
                o.getName(),
                o.getCoordinates(),
                o.getText(),
                o.getWidth(),
                o.getHeigth(),
                o.getColor()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementException(String.format(ProjectConstant.NOT_IMPLEMENTED_TEMPLATE, "deleteById"));
    }
}

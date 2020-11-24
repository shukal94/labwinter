package com.solvd.lab.automation.sshukalovich.c12.dao.impl.clasz;

import com.solvd.lab.automation.sshukalovich.c12.constant.IOConstant;
import com.solvd.lab.automation.sshukalovich.c12.dao.ButtonDAO;
import com.solvd.lab.automation.sshukalovich.c12.domain.interfaces.Button;
import com.solvd.lab.automation.sshukalovich.c12.io.ObjectIO;

import java.util.List;

public class ButtonDAOImpl implements ButtonDAO {
    @Override
    public Button create(Button o) {
        new ObjectIO<Button>().write(o, IOConstant.RQ_PATH);
        return o;
    }

    @Override
    public Button getById(Long id) {
        return new ObjectIO<Button>().read(IOConstant.RQ_PATH);
    }

    @Override
    public List<Button> get() {
        return null;
    }

    @Override
    public Button update(Button o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}

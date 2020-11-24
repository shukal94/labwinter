package com.solvd.lab.automation.sshukalovich.c12.service;

import com.solvd.lab.automation.sshukalovich.c12.dao.ButtonDAO;
import com.solvd.lab.automation.sshukalovich.c12.io.PropertyReader;

import java.util.Map;

public abstract class BaseService {
    protected static final PropertyReader PROPS = PropertyReader.getInstance();

    protected static final Map<String, ButtonDAO> BUTTON_DAOS = Map.of(
            "MOCK", new com.solvd.lab.automation.sshukalovich.c12.dao.impl.mock.ButtonDAOImpl(),
            "OBJ", new com.solvd.lab.automation.sshukalovich.c12.dao.impl.clasz.ButtonDAOImpl(),
            "SQL", new com.solvd.lab.automation.sshukalovich.c12.dao.impl.sql.ButtonDAOImplSQl()
    );
}

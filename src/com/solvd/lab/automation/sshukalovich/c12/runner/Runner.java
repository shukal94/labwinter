package com.solvd.lab.automation.sshukalovich.c12.runner;

import com.solvd.lab.automation.sshukalovich.c12.domain.button.RegularButton;
import com.solvd.lab.automation.sshukalovich.c12.domain.coordinate.Point;
import com.solvd.lab.automation.sshukalovich.c12.domain.interfaces.Button;
import com.solvd.lab.automation.sshukalovich.c12.service.ButtonService;

public class Runner {

    public static void main(String[] args) {



        Button b = new RegularButton(1, new Point(3, 4), "hi", 3, 5);

       // Button c = ButtonService.create(new RegularButton(1, new Point(3, 4), "hi", 3, 5));

        ButtonService.create(b);
        Button d = ButtonService.getById(4L);
        System.out.println("");

    }
}

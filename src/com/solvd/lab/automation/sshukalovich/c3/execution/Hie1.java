package com.solvd.lab.automation.sshukalovich.c3.execution;

import com.solvd.lab.automation.sshukalovich.c3.enums.Color;
import com.solvd.lab.automation.sshukalovich.c3.factory.ButtonFactory;
import com.solvd.lab.automation.sshukalovich.c3.factory.RadioButtonFactory;
import com.solvd.lab.automation.sshukalovich.c3.interfaces.IComponent;
import com.solvd.lab.automation.sshukalovich.c3.interfaces.IDraw;
import com.solvd.lab.automation.sshukalovich.c3.interfaces.IInput;
import com.solvd.lab.automation.sshukalovich.c3.model.Coordinates2D;
import com.solvd.lab.automation.sshukalovich.c3.model.button.RadioButton;
import com.solvd.lab.automation.sshukalovich.c3.model.field.InputField;

public class Hie1 {

    public static void main(String[] args) {

        IComponent radioButton1 =
                RadioButtonFactory
                        .createBigRadioButton("rb1", new Coordinates2D(4, 6), "hello", Color.BLUE);

        radioButton1 = ButtonFactory.createBlackButton("b1", new Coordinates2D(5, 6), "ggg", 4, 6);
        radioButton1 = new InputField(10, 20,  new Coordinates2D(4, 6), "dsf");

        IComponent rb2 = new RadioButton("rb1", new Coordinates2D(4, 6), "hello", 4, Color.BLUE);

        radioButton1.click();


        IComponent inputField = new InputField(10, 20,  new Coordinates2D(4, 6), "dsf");

        char a = 'р';
        System.out.println((int) a);

        a = 'f';

        String s = "AAAAA";
        String s1 = "AAAAA";
        s.startsWith("A", 2);
        s = s.concat(s1);
        String aaaa = "Banana, Apple, Milk";
        String[] splitted = aaaa.split(",");

        String trrr = "edgfdg dsgdsfg dsgdfg dsfg";
        trrr = trrr.trim();

        String hello = "Hello, %s%d";
        hello = String.format(hello, "Vasya", 5);
        System.out.println(hello);

        String sss = String.valueOf(5);
        boolean tttt = Boolean.valueOf("true");



    }
}

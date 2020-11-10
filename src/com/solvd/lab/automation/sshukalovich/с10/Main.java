package com.solvd.lab.automation.sshukalovich.с10;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/*Executors
* Volatile
*
* */
public class Main {
    /*Volatile*/
    public volatile static boolean done = false;
    /*Race condition*/
    public static volatile int count = 0;

    public static void main(String[] args) {
        /*Simple threads example*/
        int processorsNum = Runtime.getRuntime().availableProcessors();
        System.out.println(processorsNum);
        Runnable hellos =()->{
            for (int i = 1; i <= 20; i++)
                System.out.println("Hello " + i);
            done = true;
        };
        Runnable goodbyes =()->{
            for (int i = 1; i <= 20; i++)
                System.out.println("Goodbye " + i);
            int i = 1;
            while (!done) i++;
            System.out.println("Goodbye " + i);
        };
        /*Monitor*/
        Runnable hiJacks = () -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("HiJack " + i);
            }
        };
        Executor executor = Executors.newCachedThreadPool();
        executor.execute(hellos);
        executor.execute(goodbyes);
        executor.execute(hiJacks);

//

    }
}

package com.solvd.lab.automation.sshukalovich.с10;

import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

class ChildThread extends Thread {
    public ChildThread() {
        this("Child");
    }

    public ChildThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        IntStream s = IntStream.range(1, 10);
        PrimitiveIterator.OfInt it = s.iterator();
        while (it.hasNext()) {
            try {
                System.out.println(this.getName() + it.next());
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Child thread has finished");

    }
}

class Callme {

    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme trg, String msg) {
        this.msg = msg;
        this.target = trg;
        this.t = new Thread(this);
        this.t.start();
    }

    @Override
    public void run() {
        target.call(msg);
    }
}

class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        System.out.println("Got " + n);
        notify();
        valueSet = false;
        return n;
    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Sent " + n);
        notify();
    }
}

class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}

class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();

        System.out.println(name + " has entered into A.foo()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("A was interrupted");
        }
        System.out.println(name + " is trying to call B.last");
        b.last();
    }

    synchronized void last() {
        System.out.println("Inside of A.last()");
    }
}

class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();

        System.out.println(name + " has entered into B.bar()");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("B was interrupted");
        }
        System.out.println(name + " is trying to call A.last");
        a.last();
    }

    synchronized void last() {
        System.out.println("Inside of B.last()");
    }
}

class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Main");
        Thread t = new Thread(this, "Concurring thread");
        t.start();
        a.foo(b);

        System.out.println("Back to main");
    }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("Back to other");
    }
}

class Philosopher extends Thread
{
    Semaphore sem;
    int num = 0;
    int id;

    Philosopher(Semaphore sem, int id)
    {
        this.sem=sem;
        this.id=id;
    }

    public void run()
    {
        try
        {
            while(num<3)
            {
                sem.acquire();
                System.out.println ("Философ " + id+" садится за стол");
                sleep(500);
                num++;

                System.out.println ("Философ " + id+" выходит из-за стола");
                sem.release();

                sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println ("у философа " + id + " проблемы со здоровьем");
        }
    }
}

/*os internals*/
/*pseudo and true parallelism*/
/*frame and thread states*/
/*Custom thread*/
/*.join and wo .join*/
/*sync and locks (mutex)*/
/*wait notify */
/*deadlocks*/
/*semaphores*/
public class ShildtMain {

    public static void main(String[] args) {
        /*Basics*/
//        Thread a = new ChildThread();
//        Thread b = new ChildThread("Child2");
//        Thread c = new ChildThread("Child3");
//
//        a.start();
//        b.start();
//        c.start();
//
//        try {
//            for (int i = 0; i < 10; i++) {
//
//                System.out.println("Main" + i);
//                Thread.sleep(5);
//            }
//
//            a.join();
//            b.join();
//            c.join();
//        }
//        catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Main thread has finished");
//        /*synch*/
//        Callme target = new Callme();
//        Caller o1 = new Caller(target, "Welcome");
//        Caller o3 = new Caller(target, "to");
//        Caller o2 = new Caller(target, "synchronized world!");
//
//        try {
//            o1.t.join();
//            o2.t.join();
//            o3.t.join();
//        } catch (InterruptedException e) {
//            System.out.println("Interrupted");
//        }

//        /*wait notify*/
//        Q q = new Q();
//        new Producer(q);
//        new Consumer(q);

        /*deadlock*/
//        new Deadlock();

//        /*semaphore*/
//        Semaphore sem = new Semaphore(2);
//        for(int i=1;i<6;i++)
//            new Philosopher(sem,i).start();
    }
}

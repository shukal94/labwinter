package com.solvd.lab.automation.sshukalovich.c8;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        System.out.println(list.size());
//        list.add(" ");
//        list.add("World");
//        list.forEach(element -> {
//            System.out.print(element);
//        });
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i));
//        }
//
//        for (String element : list) {
//            System.out.print(element);
//        }
//
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            System.out.print(it.next());
//        }

//        List<String> list2 = Arrays.asList("Hello", " ", "World");
//
//        list.set(0, "Goodbye");
//        list2.set(0, "Goodbye");

//        list.add("LALALALAL");
//        System.out.println(list);
//        list2.add("LALALLALALA");


//        System.out.println(list2);
//
//        ArrayDeque<String> aa = new ArrayDeque<>();
//        aa.addFirst("first");
//        aa.addFirst("last");
//        System.out.println(aa);
//        aa.remove();
//        System.out.println(aa);
//
//        Queue<String> bb = new ArrayBlockingQueue<>(2);
//        bb.add("first");
//        bb.add("last");
//        System.out.println(bb);
//        bb.remove();
//        System.out.println(bb);

//        List<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        System.out.println(arr);
//        int first = arr.get(0);
//
//        Set<String> aa = Set.of("dsf", "asds", "dsf");
//
//        Foo bar = new Foo(new TreeSet<>(Arrays.asList("ff", "ff", "aa", "")));
//        System.out.println(bar.getNames());
//        String line;
//        try (Scanner sc = new Scanner(new BufferedInputStream(System.in))) {
//            line = sc.next();
//        }
//        System.out.println(line);

        String numsStr = "1,2,3,4,5,6,7,8";
        List<Integer> numsCol = Arrays.stream(numsStr.split(","))
                .map(Integer::valueOf)
                .filter(element -> element % 2 == 0)
                .collect(Collectors.toList());
        boolean found = numsCol.parallelStream().anyMatch(curElement -> curElement == 2);
        System.out.println(found);





    }

    static class Foo {
        private Set<String> names;

        public Foo(Set<String> names) {
            this.names = names;
        }

        public Set<String> getNames() {
            return names;
        }
    }
}

package com.github.hatimiti.trylibs.lombok;

import java.util.ArrayList;
import java.util.HashMap;
import lombok.val;

public class Main {

    public static void main(String... args) {
        testValue();
        testVal();
    }

    public static void testValue() {
        ValueExample v = new ValueExample("lombok", 33, 10.2, new String[] { "lom", "bok" });
        System.out.println(v);
        v.getTags()[0] = "LOM";
        System.out.println(v);
    }

    public static void testVal() {
        val example = new ArrayList<String>();
        example.add("Hello, World!");
        val foo = example.get(0);
        // hello, world!
        System.out.println(foo.toLowerCase()); 

        val map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for (val entry : map.entrySet()) {
            /* 0: zero
             * 5: five */
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }
}

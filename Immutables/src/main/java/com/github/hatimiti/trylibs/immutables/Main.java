package com.github.hatimiti.trylibs.immutables;

import java.util.List;

public class Main {
    public static void main(String... args) {
        alloptional();
        playerinfo();
        foobar();
    }

    private static void alloptional() {
        // No error as all values are optional
        AllOptional op1 = ImmutableAllOptional.builder().build();
        System.out.println(op1);
        
        AllOptional op2 = ImmutableAllOptional.builder()
            //.v1(1)
            .v2(2)
            .i1(1)
            .l1(1L)
            .d1(1.0)
            .build();
        System.out.println(op2);
        System.out.println();
    }
    private static void playerinfo() {
        PlayerInfo veteran = ImmutablePlayerInfo.builder()
            .id(1)
            .name("Fiddler")
            .gamesPlayed(99)
            .build();

        // PlayerInfo{id=1, name=Fiddler, gamesPlayed=99}
        System.out.println(veteran);

        PlayerInfo anonymous44 = ImmutablePlayerInfo.of(44);
        String name = anonymous44.name(); // Anonymous_4 

        // PlayerInfo{id=44, name=Anonymous_44, gamesPlayed=0}
        System.out.println(anonymous44);
        System.out.println();
    }

    private static void foobar() {
        // FoobarValue{foo=2, bar=Bar, buz=[1, 3, 4], crux={}}
        final FoobarValue value = ImmutableFoobarValue.builder()
            .foo(2)
            .bar("Bar")
            .addBuz(1, 3, 4)
            .build(); 
    
        // FooValue#foo: 2
        // FooValue#bar: Bar
        // FooValue#buz: [1, 3, 4]
        // FooValue#crux: []
        System.out.println("FooValue#foo: " + value.foo());
        System.out.println("FooValue#bar: " + value.bar());
        System.out.println("FooValue#buz: " + value.buz());
        System.out.println("FooValue#crux: " + value.crux());
    }
}

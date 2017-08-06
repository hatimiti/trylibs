package com.github.hatimiti.trylibs.javacc;

import java.io.FileReader;

public class Main {

    public static void main(final String... args) throws Exception {
        try {
            Sample parser = new Sample(new FileReader("src/main/resources/parse.txt"));
            parser.list();
        } catch(Exception ex) {
            System.err.println("Failed to parse:" + ex.getMessage());
        }
    }

}

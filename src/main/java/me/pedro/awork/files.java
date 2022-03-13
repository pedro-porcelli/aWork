package me.pedro.awork;

import java.io.File;

public class files {
    public static void main(String[] args) {
        String[] FN;

        File d = new File("aWork");
        FN = d.list();

        for (String Fn : FN) {
            System.out.print(Fn);
        }
    }
    
}
package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> string = new ArrayList<>();
        string.add("a");
        string.add("b");
        string.add("c");
        for (int i = 0; i < string.size(); i++) {
            Integer x = new Integer(i+1);
            System.out.println(string.get(i));
            string.set(i,string.get(i)+x.toString());
            System.out.println(string.get(i));
        }
    }
}

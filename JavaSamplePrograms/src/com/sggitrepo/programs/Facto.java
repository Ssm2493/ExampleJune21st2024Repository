package com.sggitrepo.programs;

public class Facto {
    public static void main(String args[]) {
        int num = 5;
        int k = 1;
        for (int i = 1; i <= num; i++) {
            k = k * i;
        }
        System.out.println("the given favtorical no" + num + "numberis " + k);
    }
}

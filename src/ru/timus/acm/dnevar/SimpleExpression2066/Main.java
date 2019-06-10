package ru.timus.acm.dnevar.SimpleExpression2066;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] abc = new int[3];
        for (int i = 0; i < abc.length; i++) {
            abc[i]=sc.nextInt();
        }
        Arrays.sort(abc);
        int sum = abc[0]-abc[1]*abc[2];
        System.out.println(sum);
    }
}

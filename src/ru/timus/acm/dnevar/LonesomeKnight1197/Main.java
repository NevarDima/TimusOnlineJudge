package ru.timus.acm.dnevar.LonesomeKnight1197;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] accessibility = {{2,3,4,4,4,4,3,2}
                                ,{3,4,6,6,6,6,4,3}
                                ,{4,6,8,8,8,8,6,4}
                                ,{4,6,8,8,8,8,6,4}
                                ,{4,6,8,8,8,8,6,4}
                                ,{4,6,8,8,8,8,6,4}
                                ,{3,4,6,6,6,6,4,3}
                                ,{2,3,4,4,4,4,3,2}};
        int testNum = sc.nextInt();
        for (int i = 0; i < testNum; i++) {
            String test = sc.next();
            System.out.println(accessibility[test.charAt(0)-'a'][test.charAt(1)-'1']);
        }
    }
}

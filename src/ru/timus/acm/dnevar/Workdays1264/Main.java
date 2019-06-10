package ru.timus.acm.dnevar.Workdays1264;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= n; j++) {
                count++;
            }
        }
        System.out.println(count);
    }
}

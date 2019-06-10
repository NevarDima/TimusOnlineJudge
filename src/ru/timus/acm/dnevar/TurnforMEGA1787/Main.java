package ru.timus.acm.dnevar.TurnforMEGA1787;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc=new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            sum+=a;
        }
        if((sum-k*n)>0){
            System.out.println(sum-k*n);
        }else{
            System.out.println("0");
        }
    }
}

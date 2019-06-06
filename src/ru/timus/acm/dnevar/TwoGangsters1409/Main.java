package ru.timus.acm.dnevar.TwoGangsters1409;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numCan = 10;
        Scanner sc=new Scanner(System.in);
        int Garry = sc.nextInt();
        int Larry = sc.nextInt();
        System.out.println("Гарри не сбил: " + (numCan-Garry));
        System.out.println("Ларри не сбил: " + (numCan-Larry));
    }
}

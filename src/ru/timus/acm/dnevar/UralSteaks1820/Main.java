package ru.timus.acm.dnevar.UralSteaks1820;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int steakNum = sc.nextInt();
        int pan = sc.nextInt();

        System.out.println((int) Math.ceil(steakNum * 2 / pan));
    }
}

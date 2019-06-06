package ru.timus.acm.dnevar.Eniya1293;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[3];
        int sulfid = 1;

        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            sulfid*=nums[i];
        }
        System.out.println(sulfid*2);
    }
}

package ru.timus.acm.dnevar.AboutGrishaN2012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();

        if(i>0 && i<7){
            System.out.println("NO");
        }else if(i>6 && i<12){
            System.out.println("YES");
        }else{
            System.out.println("вне диапазона");
        }

    }
}

package ru.timus.acm.dnevar.LostInLocalization1785;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();

        if(i>0 && i<5){
            System.out.println("few");
        }else if(i>4 && i<10){
            System.out.println("several");
        }else if(i>9 && i<20){
            System.out.println("pack");
        }else if(i>19 && i<50){
            System.out.println("lots");
        }else if(i>49 && i<100){
            System.out.println("horde");
        }else if(i>99 && i<250){
            System.out.println("throng");
        }else if(i>249 && i<500){
            System.out.println("swarm");
        }else if(i>499 && i<1001){
            System.out.println("zounds");
        }else if(i>1000 && i<2001){
            System.out.println("legion");
        }else{
            System.out.println("вне диапазона");
        }
    }
}

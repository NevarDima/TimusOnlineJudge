package ru.timus.acm.dnevar.BicycleCodes1877;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int zamok1 = sc.nextInt();
        int zamok2 = sc.nextInt();
        boolean vzlom = false;
        for (int i = 0; i < 10000; i++) {
            if(i%2==0){
                if(zamok1==i){
                    vzlom = true;
                }
            }else{
                if(zamok2==i){
                    vzlom = true;
                }
            }
        }
        if(vzlom == false){
            System.out.println("no");
        }else{
            System.out.println("yes");
        }

    }
}

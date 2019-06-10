package ru.timus.acm.dnevar.PsychUpsEigenvalues1880;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int man1 = sc.nextInt();
        int[] arr = new int[man1];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int man2 = sc.nextInt();
        Arrays.copyOf(arr,arr.length+man2);
        for (int i = arr.length-man2; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int man3 = sc.nextInt();
        Arrays.copyOf(arr,arr.length+man3);
        for (int i = arr.length-man3; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i+1] && arr[i+1] == arr[i+2]) {
                if (i != arr.length-3){
                    count++;
                }else {
                    break;
                }
            }
        }

    }
}

package ru.timus.acm.dnevar.ReverseRoot1001;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String line;
        String[] element = new String[100];
        int elemPos=0;

        while(!((line=sc.nextLine()).equals("end"))){
            String[] buffer = line.trim().replaceAll("\\s+"," ").split(" ");
            System.arraycopy(buffer,0,element,elemPos,buffer.length);
            elemPos+=buffer.length;
        }

        for (int i = element.length-1; i >= 0; i--) {
            if(element[i]!=null){
                System.out.println(Math.sqrt(Double.parseDouble(element[i])));
            }
        }
    }
}

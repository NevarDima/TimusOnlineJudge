package ru.timus.acm.dnevar.DemocracyInDanger1025;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int group = sc.nextInt();
		int[] people = getArray(sc.nextLine());
		System.out.println("group " + group);

		for (int i = 0; i < people.length; i++) {
			System.out.println("people " + i + " " + people[i]);
		}

		sortArray(people);

		for (int i = 0; i < people.length; i++) {
			System.out.println("sortPeople " + i + " " + people[i]);
		}
		int sum = 0;

		for (int i = 0; i < people.length/2 + 1; i++) {
			sum = sum + people[i]/2 + 1;
		}

		System.out.println("Минимальное количество сторонников партии: " + sum);

    }

	static int[] getArray(String line){
		String[] strArray = line.trim().split(" ");
		int[] array=new int[strArray.length];
		for (int i = 0; i < array.length; i++) {
			array[i]=Integer.parseInt(strArray[i]);
		}
		return array;
	}

	static int[] sortArray(int mas[]){
    	boolean swap;
    	int buffer;
    	int [] sortMas = new int[mas.length];
		do{
			swap = false;
			for (int i = 0; i < mas.length-1; i++) {
				if(mas[i]>mas[i+1]){
					buffer = mas[i];
					mas[i]= mas[i+1];
					mas[i+1]= buffer;
					swap = true;
				}
			}
		} while(swap);
    	return sortMas;
	}
}

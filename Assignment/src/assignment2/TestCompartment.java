package assignment2;

import java.util.Random;
import java.util.Scanner;

public class TestCompartment {

	public static void main(String[] args) {
		int n=0;
		Scanner sc = new Scanner(System.in);
		Compartment com[] = new Compartment[10];
		Random	rand=new Random();
		for (int i = 0; i <= 9; i++) {
			int compt=rand.nextInt(3)+1;
			switch (compt) {
			case 1:
				com[n]=new FirstClass();
				com[n].Notice();
				n++;
				break;
				
			case 2:
				com[n]=new Ladies();
				com[n].Notice();
				n++;
				break;
				
				
			case 3:
				com[n]=new General();
				com[n].Notice();
				n++;
				break;
				
				
			case 4:
				com[n]=new Luggage();
				com[n].Notice();
				n++;
				break;	

			}
			
		}
		for (int i = 0; i < com.length; i++) {
			
			System.out.println("Index: "+i+com[i]);
			
		}

	}

}

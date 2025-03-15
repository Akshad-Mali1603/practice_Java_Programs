package assignment1;

import java.util.Scanner;

public class TestInstrument {
	
	public static void main(String[] args) {
		int n=0;
		Scanner sc = new Scanner(System.in);
				Instrument m[] = new Instrument[500];
				while (true) {
				System.out.println("\n1. Piano\n2. Flute\n3. Guitar\n4. Display Instruments\n5. Display Piano\n6. Display Flute\n5. Display Guitar\n8. EXIT\nWhich instrument you want to Enter: \n");
				int ch=sc.nextInt();
				switch (ch) {
				case 1:
					m[n]=new Piano();
					m[n].play();
					n++;				
					break;
				
				case 2:
					m[n]=new Flute();
					m[n].play();
					n++;				
					break;
					
				case 3:
					m[n]=new Guitar();
					m[n].play();
					n++;	
					break;
				case 4:
					for (int i = 0; i < n; i++) {
						if (m[i] instanceof Piano) {
							System.out.println("Index is: "+i+" it is Piano");		
						}else if (m[i] instanceof Flute) {
							System.out.println("Index is: "+i+" it is Flute");
						}else if (m[i] instanceof Guitar) {
							System.out.println("Index is: "+i+" it is Guitar");						
						}
					}			
					break;
					
				case 5:
					for (int i = 0; i < m.length; i++) {
						if (m[i] instanceof Piano) {
							System.out.println("Index: "+i+" it is piano");
							
						}
					}
					break;
				
				case 6:
					for (int i = 0; i < m.length; i++) {
						if (m[i] instanceof Flute) {
							System.out.println("Index: "+i+" it is flute");
							
						}
					}
					break;
					
				case 7:
					for (int i = 0; i < m.length; i++) {
						if (m[i] instanceof Guitar) {
							System.out.println("Index: "+i+" it is guitar");
							
						}
					}
					break;
					
				case 8:
					System.exit(0);			
					break;
					
				default:
					System.out.println("Invalid Choice !!!");
					break;
				}
				
				
			}
				
		}
	}

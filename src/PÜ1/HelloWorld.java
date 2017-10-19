package PÜ1;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * System.out.println("Hello DENIZ");
		 * System.out.println("ICH BIN GEILER ALS YUSUF");
		 * 
		 * 
		 * for (int i=0; i<=10000000; i=i+1000) System.out.println(i);{ }
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte geben sie eine Zahl ein!");
		int quersumme = 0;
		int num;
		double divided;
		int in = sc.nextInt();
		do {
			num = in % 10;
			divided = (in / 10.0-(int) (in/10))*10;
			in = in / 10;
			quersumme += num;
			System.out.println(num);
		} while (in > 0);
		System.out.println("Die Quersumme ist " + quersumme);
	}

}

package PÜ1;

import java.util.Scanner;

public class Währungsrechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double betrag, ergebnis;
		double wechselkurs = 1.1805;
		

		

System.out.println("Für Euro -> Dollar, wähle die 1");
System.out.println("Für Dollar -> Euro, wähle die 2");

Scanner sc = new Scanner(System.in);

int eingabe = sc.nextInt();

/*
if(eingabe==1) {
	System.out.println("Bitte Betrag in Euro eingeben");
	betrag = sc.nextDouble();
	ergebnis = betrag*wechselkurs;
	System.out.println(betrag+" Euro = "+ergebnis+" Dollar");
	
}
else if(eingabe==2) {
	System.out.println("Bitte Betrag in Dollar eingeben");
	betrag = sc.nextDouble();
	ergebnis = betrag/wechselkurs;
	System.out.println(betrag+" Dollar = "+ergebnis+" Euro");
	
}
else{
	System.out.println("Falsche Eingabe");
}
*/

switch(eingabe) {
case 1: System.out.println("Bitte Betrag in Euro eingeben");
		betrag = sc.nextDouble();
		ergebnis = betrag*wechselkurs;
		System.out.println(betrag+" Euro = "+ergebnis+" Dollar");
		break;
case 2: System.out.println("Bitte Betrag in Dollar eingeben");
		betrag = sc.nextDouble();
		ergebnis = betrag/wechselkurs;
		System.out.println(betrag+" Dollar = "+ergebnis+" Euro");
		break;
default: System.out.println("Falsche Eingabe");
		break;

	}
	}
}


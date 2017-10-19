package PÜ1;

public class Schleife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 0;
		int sign = 2;
		while (number < 9) {
			System.out.println(number * sign);
			number ++;
			sign = sign *= -1;

		}

	}

}

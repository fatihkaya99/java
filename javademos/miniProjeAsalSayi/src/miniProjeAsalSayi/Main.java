package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {

		// bug = böcek uygulamada mantıksal hata, açıklar
		int number = 1;
		int remainder = number % 2;
		// System.out.println(remainder); // remainder=kalan
		boolean isPrime = true; // prime=asal
		
		if (number==1) {
			System.out.println("Sayı asal değildir");
			return;
			
		}
		if (number < 1) {
			System.out.println("Geçersiz sayı");

		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Sayı asaldır");

		} else {
			System.out.println("Sayı asal değildir");
		}

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int sayi1, sayi2, secim ;

		System.out.println("Birinci sayısı giriniz: ");
		sayi1 = scan.nextInt();

		System.out.println("İkinci sayıyı giriniz: ");
		sayi2 = scan.nextInt();

		System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme\n");
		
		System.out.println("Bir işlem seçiniz: ");
		secim = scan.nextInt();

		switch (secim) {
		case 1:
			System.out.println("Toplama İşleminin Sonucu: " + (sayi1 + sayi2));
			break;
		case 2:
			System.out.println("Çıkarma İşleminin Sonucu: " + Math.abs(sayi1 - sayi2));
			break;
		case 3:
			System.out.println("Çarpma İşleminin Sonucu: " + (sayi1 * sayi2));
			break;
		case 4:
			System.out.println("Bölme İşleminin Sonucu: " + (sayi1 / sayi2));
			break;
		default:
			System.out.println("Lütfen geçerli bir sayı giriniz.");
		}

	}

}

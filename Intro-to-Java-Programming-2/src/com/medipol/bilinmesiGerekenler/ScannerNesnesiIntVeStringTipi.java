package com.medipol.bilinmesiGerekenler;

import java.util.Scanner;

public class ScannerNesnesiIntVeStringTipi {

	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		
		System.out.println("Lütfen ilk tamsayıyı giriniz : ");
		int n = giris.nextInt();
		
		System.out.println("Lütfen ikinci tamsayıyı giriniz : ");
		int m = giris.nextInt();

		giris.nextLine();// Bunun nedeni, nextInt() yürütmesini bitirdikten sonra, nextLine() yöntemi
							// çağrıldığında, nextInt()'den sonra mevcut olan yeni satır karakterini tarar.
		// Eklemeniz gereken yukaridaki satır (\n karakterini tüketir)
		System.out.println("Lütfen adinizi giriniz : ");
		String ad = giris.nextLine();
		
		System.out.println("Lutfen 3 tamsayi giriniz : ");
		int z = giris.nextInt();
		
		int toplam = n + m+z;

		System.out.print("Toplami yapan kisinin adi: " + ad + " sonucu: " +toplam);
	}

}

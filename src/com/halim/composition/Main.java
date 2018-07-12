package com.halim.composition;

/*
 * composition is-a de�ilde Has-A ili�kisi vard�r.
 * burada par�a  s�n�flar birle�tirilerek bir s�n�f olu�turuyor diyebiliriz
 * orne�im ��mdiki ornekte olu�turaca��m�z gibi;
 * bir masa�st� bilgisayar yap�m9� i�im ekra,kasa,anakart gibi bile�enleri bir araya getirmek gibi.*/

public class Main {

	public static void main(String[] args) {
		
		Resolution resolution = new Resolution(1920, 1020);
		
		//monitorun i�ine resolution direk gondermi� oluyoruz.
		Monitor monitor = new Monitor("VS198DEHP", "HP", "18.8", resolution);
		
		Kasa kasa = new Kasa("SHEDOWBLADE", "SHADOW", "temperli cam");
		Anakart anakart = new Anakart("b250pro", "ASUS", 10, "Wind�ws10");
		
		Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);
		//art�k bilgisayar s�n�f�n�n i�inde monitor,kasa , anakart direk g�ndermi� olduk
		
		pc.getKasa().bilgisayari_ac();//�eklinde getKasa ile kasa objesini al�p i�indeki metoda eri�mi� olduk.
		pc.getMonitor().MonitoruKapat();
		pc.getAnakart().isletim_sistemiyukle("Ubuntu 16.5");
		
		/*��te compositionun manr�i�i bu aasl�nda i� i�e referanslar�m�z var ve biz
		 * bu referanslar sayesinde istedi�imiz s�n�f ve verilere ula�abiliyoruz.
		 * i�te burada has-a ili�kisi var yani bilgisaayar ; kasa,monitor,anakart classlar�na sahiptir.*/
	}
}

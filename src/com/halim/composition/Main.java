package com.halim.composition;

/*
 * composition is-a deðilde Has-A iliþkisi vardýr.
 * burada parça  sýnýflar birleþtirilerek bir sýnýf oluþturuyor diyebiliriz
 * orneðim þýmdiki ornekte oluþturacaðýmýz gibi;
 * bir masaüstü bilgisayar yapým9ý içim ekra,kasa,anakart gibi bileþenleri bir araya getirmek gibi.*/

public class Main {

	public static void main(String[] args) {
		
		Resolution resolution = new Resolution(1920, 1020);
		
		//monitorun içine resolution direk gondermiþ oluyoruz.
		Monitor monitor = new Monitor("VS198DEHP", "HP", "18.8", resolution);
		
		Kasa kasa = new Kasa("SHEDOWBLADE", "SHADOW", "temperli cam");
		Anakart anakart = new Anakart("b250pro", "ASUS", 10, "Windýws10");
		
		Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);
		//artýk bilgisayar sýnýfýnýn içinde monitor,kasa , anakart direk göndermiþ olduk
		
		pc.getKasa().bilgisayari_ac();//þeklinde getKasa ile kasa objesini alýp içindeki metoda eriþmiþ olduk.
		pc.getMonitor().MonitoruKapat();
		pc.getAnakart().isletim_sistemiyukle("Ubuntu 16.5");
		
		/*Ýþte compositionun manrýiði bu aaslýnda iç içe referanslarýmýz var ve biz
		 * bu referanslar sayesinde istediðimiz sýnýf ve verilere ulaþabiliyoruz.
		 * iþte burada has-a iliþkisi var yani bilgisaayar ; kasa,monitor,anakart classlarýna sahiptir.*/
	}
}

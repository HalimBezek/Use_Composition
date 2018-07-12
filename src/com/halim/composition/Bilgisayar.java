package com.halim.composition;

public class Bilgisayar {
	
	//buradaki sýnýf bilgilerinin hepsini bilgisayar kalsýnda kullanacaðýz.
	private Monitor monitor;
	private Kasa kasa;
	private Anakart anakart;
	
	public Bilgisayar(Monitor monitor, Kasa kasa, Anakart anakart) {
		super();
		this.monitor = monitor;
		this.kasa = kasa;
		this.anakart = anakart;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Kasa getKasa() {//bu bize kasa obje referansýný gonderiyor bu durumda, bu obje ile kasa içindeki sýnýf ve 
		  //metotlarý kullanabileceðiz. Ve bu diðer sýnýflar içinde böyledir.
		return kasa;
	}

	public void setKasa(Kasa kasa) {
		this.kasa = kasa;
	}

	public Anakart getAnakart() {
		return anakart;
	}

	public void setAnakart(Anakart anakart) {
		this.anakart = anakart;
	}
	
	

}

package com.halim.composition;

public class Bilgisayar {
	
	//buradaki s�n�f bilgilerinin hepsini bilgisayar kals�nda kullanaca��z.
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

	public Kasa getKasa() {//bu bize kasa obje referans�n� gonderiyor bu durumda, bu obje ile kasa i�indeki s�n�f ve 
		  //metotlar� kullanabilece�iz. Ve bu di�er s�n�flar i�inde b�yledir.
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

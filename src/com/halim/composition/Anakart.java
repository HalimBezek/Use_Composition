package com.halim.composition;

public class Anakart {

	private String model;
	private String �retici;
	private int yuva_sayisi;
	private String isletim_sistemi;
	
	public Anakart(String model, String �retici, int yuva_sayisi, String isletim_sistemi) {

		this.model = model;
		this.�retici = �retici;
		this.yuva_sayisi = yuva_sayisi;
		this.isletim_sistemi = isletim_sistemi;
	}
	
	public void isletim_sistemiyukle(String isletim_sistemi) {
		this.isletim_sistemi = isletim_sistemi;
		System.out.println("��letim sistemi y�klendi : " + isletim_sistemi);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String get�retici() {
		return �retici;
	}

	public void set�retici(String �retici) {
		this.�retici = �retici;
	}

	public int getYuva_sayisi() {
		return yuva_sayisi;
	}

	public void setYuva_sayisi(int yuva_sayisi) {
		this.yuva_sayisi = yuva_sayisi;
	}

	public String getIsletim_sistemi() {
		return isletim_sistemi;
	}

	public void setIsletim_sistemi(String isletim_sistemi) {
		this.isletim_sistemi = isletim_sistemi;
	}
	
	
}

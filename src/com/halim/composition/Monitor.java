package com.halim.composition;

public class Monitor {
	
	private String model;
	private String üretici;
	private String boyut;
	private Resolution resolution;//resolution sýnýfýndan nesne oluþturmakla burada composition oluþturduk
	
	public Monitor(String model, String üretici, String boyut, Resolution resolution) {
		super();
		this.model = model;
		this.üretici = üretici;
		this.boyut = boyut;
		this.resolution = resolution;
	}

	public void MonitoruKapat() {
		System.out.println("Monitor kapatýlýyor.");
	}
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getÜretici() {
		return üretici;
	}

	public void setÜretici(String üretici) {
		this.üretici = üretici;
	}

	public String getBoyut() {
		return boyut;
	}

	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}

	public Resolution getResolution() {
		return resolution;
	}

	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}
	
	
}

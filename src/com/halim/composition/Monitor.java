package com.halim.composition;

public class Monitor {
	
	private String model;
	private String �retici;
	private String boyut;
	private Resolution resolution;//resolution s�n�f�ndan nesne olu�turmakla burada composition olu�turduk
	
	public Monitor(String model, String �retici, String boyut, Resolution resolution) {
		super();
		this.model = model;
		this.�retici = �retici;
		this.boyut = boyut;
		this.resolution = resolution;
	}

	public void MonitoruKapat() {
		System.out.println("Monitor kapat�l�yor.");
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

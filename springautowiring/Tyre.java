package com.java.spring.springautowiring;

public class Tyre {

	private int tyreId;
	private String tyreCompName;
	private double tyreSize;

	public Tyre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tyre(int tyreId, String tyreCompName, double tyreSize) {
		super();
		this.tyreId = tyreId;
		this.tyreCompName = tyreCompName;
		this.tyreSize = tyreSize;
	}

	@Override
	public String toString() {
		return "\n [tyreId=" + tyreId + ", tyreCompName=" + tyreCompName + ", tyreSize=" + tyreSize + "]";
	}

	public int getTyreId() {
		return tyreId;
	}

	public void setTyreId(int tyreId) {
		this.tyreId = tyreId;
	}

	public String getTyreCompName() {
		return tyreCompName;
	}

	public void setTyreCompName(String tyreCompName) {
		this.tyreCompName = tyreCompName;
	}

	public double getTyreSize() {
		return tyreSize;
	}

	public void setTyreSize(double tyreSize) {
		this.tyreSize = tyreSize;
	}

}

package com.java.spring.constructorwiring;

public abstract class Car {

	private int carId;
	private String carName;
	private Engine engine;
	private AC ac;
	private Tyre tyre;

	public Car() {
		super();
	
	}

	public Car(int carId, String carName, Engine engine, AC ac, Tyre tyre) {
		super();
		this.carId = carId;
		this.carName = carName;
	this.engine = engine;
		this.ac = ac;
		this.tyre = tyre;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", ac=" + ac + ", tyre=" + tyre + ", Engine="
				+ getEngine() + "]";
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
		
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	/*
	 * public Engine getEngine() { return engine; }
	 * 
	 * public void setEngine(Engine engine) { this.engine = engine; }
	 */

	public abstract Engine getEngine();
	
	public AC getAc() {
		return ac;
	}

	public void setAc(AC ac) {
		this.ac = ac;
	}

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

}

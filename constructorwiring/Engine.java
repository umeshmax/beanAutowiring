package com.java.spring.constructorwiring;

public class Engine {

	private int id;
	private String engName;
	private double engPower;
	private EngineType engineType;
	private EngineTransmissionType transmissionType;

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engine(int id, String engName, double engPower, EngineType engineType,
			EngineTransmissionType transmissionType) {
		super();
		this.id = id;
		this.engName = engName;
		this.engPower = engPower;
		this.engineType = engineType;
		this.transmissionType = transmissionType;
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", engName=" + engName + ", engPower=" + engPower + ", engineType=" + engineType
				+ ", transmissionType=" + transmissionType + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEngName() {
		return engName;
	}

	public void setEngName(String engName) {
		this.engName = engName;
	}

	public double getEngPower() {
		return engPower;
	}

	public void setEngPower(double engPower) {
		this.engPower = engPower;
	}

	public EngineType getEngineType() {
		return engineType;
	}

	public void setEngineType(EngineType engineType) {
		this.engineType = engineType;
	}

	public EngineTransmissionType getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(EngineTransmissionType transmissionType) {
		this.transmissionType = transmissionType;
	}

}

package com.java.spring.springautowiring;

public class EngineType {

	private int typeId;
	private String engPetDes;

	public EngineType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EngineType(int typeId, String engPetDes) {
		super();
		this.typeId = typeId;
		this.engPetDes = engPetDes;
	}

	@Override
	public String toString() {
		return "\n [typeId=" + typeId + ", engPetDes=" + engPetDes + "]";
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getEngPetDes() {
		return engPetDes;
	}

	public void setEngPetDes(String engPetDes) {
		this.engPetDes = engPetDes;
	}

}

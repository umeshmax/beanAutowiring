package com.java.spring.springautowiring;

public class AC {

	private int acId;
	private String acCompName;
	private String acMode;

	public AC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AC(int acId, String acCompName, String acMode) {
		super();
		this.acId = acId;
		this.acCompName = acCompName;
		this.acMode = acMode;
	}

	@Override
	public String toString() {
		return "\n [acId=" + acId + ", acCompName=" + acCompName + ", acMode=" + acMode + "]";
	}

	public int getAcId() {
		return acId;
	}

	public void setAcId(int acId) {
		this.acId = acId;
	}

	public String getAcCompName() {
		return acCompName;
	}

	public void setAcCompName(String acCompName) {
		this.acCompName = acCompName;
	}

	public String getAcMode() {
		return acMode;
	}

	public void setAcMode(String acMode) {
		this.acMode = acMode;
	}

}

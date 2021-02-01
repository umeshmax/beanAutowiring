package com.java.spring.constructorwiring;

public class AC {

	private int acId;
	private String acCompName;
	private String acMode;
	private ACWarrentyDetail warrentyDetail;

	public AC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AC(int acId, String acCompName, String acMode, ACWarrentyDetail warrentyDetail) {
		super();
		this.acId = acId;
		this.acCompName = acCompName;
		this.acMode = acMode;
		this.warrentyDetail = warrentyDetail;
	}

	@Override
	public String toString() {
		return "AC [acId=" + acId + ", acCompName=" + acCompName + ", acMode=" + acMode + ", warrentyDetail="
				+ warrentyDetail + "]";
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

	public ACWarrentyDetail getWarrentyDetail() {
		return warrentyDetail;
	}

	public void setWarrentyDetail(ACWarrentyDetail warrentyDetail) {
		this.warrentyDetail = warrentyDetail;
	}

}

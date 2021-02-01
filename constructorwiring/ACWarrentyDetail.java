package com.java.spring.constructorwiring;

public class ACWarrentyDetail {

	private int warrentyDetailId;
	private int warrentyMonth;

	public ACWarrentyDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ACWarrentyDetail(int warrentyDetailId, int warrentyMonth) {
		super();
		this.warrentyDetailId = warrentyDetailId;
		this.warrentyMonth = warrentyMonth;
	}

	@Override
	public String toString() {
		return "ACWarrentyDetail [warrentyDetailId=" + warrentyDetailId + ", warrentyMonth=" + warrentyMonth + "]";
	}

	public int getWarrentyDetailId() {
		return warrentyDetailId;
	}

	public void setWarrentyDetailId(int warrentyDetailId) {
		this.warrentyDetailId = warrentyDetailId;
	}

	public int getWarrentyMonth() {
		return warrentyMonth;
	}

	public void setWarrentyMonth(int warrentyMonth) {
		this.warrentyMonth = warrentyMonth;
	}

}

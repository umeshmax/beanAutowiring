package com.java.spring.constructorwiring;

public class EngineTransmissionType {

	private int trTypwId;
	private String trantype;

	public EngineTransmissionType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EngineTransmissionType(int trTypwId, String trantype) {
		super();
		this.trTypwId = trTypwId;
		this.trantype = trantype;
	}

	@Override
	public String toString() {
		return "\n [trTypwId=" + trTypwId + ", trantype=" + trantype + "]";
	}

	public int getTrTypwId() {
		return trTypwId;
	}

	public void setTrTypwId(int trTypwId) {
		this.trTypwId = trTypwId;
	}

	public String getTrantype() {
		return trantype;
	}

	public void setTrantype(String trantype) {
		this.trantype = trantype;
	}

}

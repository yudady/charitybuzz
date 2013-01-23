package com.charitybuzz.controller.msg;

public class ReturnMsg {

	private String msg;
	private String errorMsg;
	private int errorCode;

	public ReturnMsg(String msg) {
		super();
		this.msg = msg;
	}

	public ReturnMsg(String errorMsg, int errorCode) {
		this.errorMsg = errorMsg;
		this.errorCode = errorCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

}

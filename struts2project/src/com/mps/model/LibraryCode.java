package com.mps.model;

public class LibraryCode {
	private String libCode;
	public static String libCode1;
	public String getLibCode() {
		System.out.println("get libCode : "+libCode);
		return libCode;
	}

	public void setLibCode(String libCode) {
		System.out.println("set libCode : "+libCode);
		libCode1=libCode;
		this.libCode = libCode;
	}

}

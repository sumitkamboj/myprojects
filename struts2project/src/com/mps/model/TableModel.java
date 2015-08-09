package com.mps.model;

public class TableModel {
private String institutionName;
private String YTD;
public String getInstitutionName() {
	System.out.println("db get ins model :"+institutionName);
	return institutionName;
}

public void setInstitutionName(String institutionName) {
	System.out.println("db set ins model : "+institutionName);
	this.institutionName = institutionName;
}

public String getYTD() {
	System.out.println("db get YTD "+YTD );
	return YTD;
}

public void setYTD(String yTD) {
	System.out.println("db set YTD "+yTD );
	YTD = yTD;
}
}

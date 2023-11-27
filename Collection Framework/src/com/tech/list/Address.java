package com.tech.list;

public class Address {
	
	private String areaName;
	
	private String cityName;
	
	//   get/set

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "areaName=" + areaName + ", cityName=" + cityName;
	}
	

}

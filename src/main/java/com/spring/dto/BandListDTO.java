package com.spring.dto;

// 모든 밴드와 userid가 있는 DTO
public class BandListDTO {
	
	private int bandcode;
	private String bandname;
	private String intro;
	public int getBandcode() {
		return bandcode;
	}
	public void setBandcode(int bandcode) {
		this.bandcode = bandcode;
	}
	public String getBandname() {
		return bandname;
	}
	public void setBandname(String bandname) {
		this.bandname = bandname;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}

	
	
	
	
}

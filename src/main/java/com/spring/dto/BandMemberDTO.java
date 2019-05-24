package com.spring.dto;
//모든 멤버와 밴드들의 매칭 테이블 
// 1. userid를 통해 자신이 속한 band code 뽑아냄
// 1. bandcode를 통해 거기에 속한 userid를 뽑아냄
public class BandMemberDTO {
	private int bandCode;
	private String userId;
	
	public int getBandCode() {
		return bandCode;
	}
	public void setBandCode(int bandCode) {
		this.bandCode = bandCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	
}

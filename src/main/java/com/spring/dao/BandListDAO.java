package com.spring.dao;

import java.util.List;

import com.spring.dto.BandListDTO;

public interface BandListDAO {
	public List<BandListDTO> list(String userid);
	
}

package com.spring.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.dto.BandListDTO;

@Repository
public class BandListDAOImpl implements BandListDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<BandListDTO> list(String userid) {
		
		
		 //this.sqlSession.sele
		List<BandListDTO> list = this.sqlSession.selectList("bandlistselect", userid);
		
		if(list.size() != 0) {
			System.out.println("tdfsa");
		}
	
		return list;
	}
}

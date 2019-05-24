package com.spring.band;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.dao.BandListDAOImpl;
import com.spring.dto.BandListDTO;

@Controller
public class BandListController {
	
	@Autowired
	private BandListDAOImpl dao;
	
	@RequestMapping("/bandlist.do")
	public String list(Model model,@RequestParam("userId") String userid){
		 
		List<BandListDTO> list = this.dao.list(userid);
		model.addAttribute("bandlist",list);
		return "bandlist";
	}
	
	@RequestMapping("/bandlistadd.do")
	public String listadd(Model model) {
		
		return "bandlistadd";
	}
}

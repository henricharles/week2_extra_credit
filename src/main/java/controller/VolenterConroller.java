package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import domain.Volenteer;
import service.VolenteerService;


@Controller
public class VolenterConroller {
	
	@Autowired
	private VolenteerService volenteerService;

	
	@RequestMapping(value = "/volunteerview", method = RequestMethod.GET)
	public String Index() {
		volenteerService.getAllVolenteer().forEach(System.out::println);
		return "volenteerview";
	
	}
	
	}



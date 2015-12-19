package com.controller;

import com.receiver.utilities.UtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {

	private UtilService utilService;

     @Autowired
	public void setUtilService(UtilService utilService) {
		this.utilService = utilService;
	}

	@RequestMapping(value = "/dashboard/show", method = RequestMethod.GET)
	public String showIndexPage() {
		System.out.println(utilService.getMessage());
		return "index";
	}



}

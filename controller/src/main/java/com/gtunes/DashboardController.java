package com.gtunes;

import com.service.utilities.UtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DashboardController extends AbstractController {

	private UtilService utilService;


	public void setUtilService(UtilService utilService) {
		this.utilService = utilService;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
												 HttpServletResponse response) throws Exception {
		System.out.println("****************************"+utilService.getMessage());
		ModelAndView modelAndView = null;

		modelAndView = new ModelAndView();
		modelAndView.setViewName("index");

		return modelAndView;
	}

}

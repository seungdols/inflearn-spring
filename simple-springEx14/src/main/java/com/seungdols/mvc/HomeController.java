package com.seungdols.mvc;

import com.seungdols.model.StudentInfomation;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @PACKAGE com.seungdols.mvc
 * @AUTHOR seungdols
 * @DATE 2017. 10. 19.
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}


	/*
	 GET으로 요청이 오는 경우
 */
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String getParam(HttpServletRequest servletRequest, Model model) {

		System.out.println("RequestMethod.GET");

		String id = servletRequest.getParameter("id");
		System.out.println("id : " + id);
		model.addAttribute("studentId", id);

		return "student/list";
	}


	/*
	 POST로 요청이 오는 경우
	 */
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public ModelAndView getParam(HttpServletRequest servletRequest) {

		System.out.println("RequestMethod.POST");

		String id = servletRequest.getParameter("id");
		System.out.println("id : " + id);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("student/list");
		modelAndView.addObject("studentId", id);
		return modelAndView;
	}


	/*
		@ModelAttribute는 model object의 이름을 줄여주는 기능 - view에서 사용시!
	 */
	@RequestMapping(value = "/student/list")
	public String getList(@ModelAttribute("studentInfo") StudentInfomation studentInfomation,
			HttpServletRequest servletRequest) {

		return "student/show";
	}

	@RequestMapping(value = "/home")
	public String redirectionExam(HttpServletRequest servletRequest) {
		return "redirect:/";
	}

}

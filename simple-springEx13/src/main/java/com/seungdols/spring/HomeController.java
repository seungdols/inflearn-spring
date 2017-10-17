package com.seungdols.spring;

import com.seungdols.model.Member;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @PACKAGE com.seungdols.spring
 * @AUTHOR seungdols
 * @DATE 2017. 10. 17.
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String hello() {
		return "index";
	}

	@RequestMapping(value = "/member/view")
	public String memberList(HttpServletRequest servletRequest, Model model) {

		String id = servletRequest.getParameter("id");
		String password = servletRequest.getParameter("pw");

		model.addAttribute("id", id);
		model.addAttribute("pw", password);

		return "member/view";
	}

	/*
		@RequestParam annotaion에 boolean required() default true;로 설정 되어 @RequestParam값이 입력되지않으면, 400 에러발생
	 */
	@RequestMapping(value = "/member/confirm")
	public String memberConfirm(@RequestParam("id") String id, @RequestParam("pw") Integer pw,
			Model model) {

		model.addAttribute("id", id);
		model.addAttribute("pw", pw);

		return "member/confirm";
	}

//	@RequestMapping(value = "/member/join")
//	public String memberJoin(@RequestParam("name") String name, @RequestParam("id") String id,
//			@RequestParam("pw") String pw, @RequestParam("email") String email, Model model) {
//
//		Member member = new Member();
//		member.setName(name);
//		member.setId(id);
//		member.setPw(pw);
//		member.setEmail(email);
//
//		model.addAttribute("member", member);
//
//		return "member/join";
//	}

	@RequestMapping(value = "/member/join")
	public String memberJoin(Member member) {
		return "member/join";
	}

	@RequestMapping(value = "/member/user/{userId}")
	public String memberListView(@PathVariable String userId, Model model) {

		model.addAttribute("id", userId);

		return "member/user";
	}

}

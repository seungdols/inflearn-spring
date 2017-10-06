package com.seungdols.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @PACKAGE com.seungdols.mvc
 * @AUTHOR seungdols
 * @DATE 2017. 10. 6.
 */
@Controller
@RequestMapping(value = "/board")
public class BoardController {

	@RequestMapping(value = "/list")
	public String boardList(Model model) {
		model.addAttribute("id", "seungdols");
		return "list";
	}

	@RequestMapping(value = "/edit")
	public ModelAndView boardEditView() {
		ModelAndView view = new ModelAndView("edit");

		view.addObject("id", "seungdols");
		return view;
	}

}

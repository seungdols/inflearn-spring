package com.seungdols.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @PACKAGE com.seungdols.mvc
 * @AUTHOR seungdols
 * @DATE 2017. 10. 6.
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String home() {
		return "index";
	}

}

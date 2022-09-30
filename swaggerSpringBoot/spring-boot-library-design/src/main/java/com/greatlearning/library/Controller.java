package com.greatlearning.library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/abc")
	public String abc ()
	{
		return "rssb";
	}
}

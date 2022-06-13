package edu.itc.I4gic.Library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FinalController {
	
	@GetMapping(path="/final")
	public String index() {
		return "final";
	}

}

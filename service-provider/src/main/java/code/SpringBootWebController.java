package code;

// Copyright (c) 2024, NoCodeNoLife-cloud. All rights reserved.
// Author: NoCodeNoLife-cloud
// stay hungry，stay foolish
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/")
public class SpringBootWebController {
	/**
	 * This method handles the HTTP request and returns a ResponseEntity with a status and an information body.
	 *
	 * @return The ResponseEntity with the status and body.
	 */
	@RequestMapping("/blog")
	@ResponseBody
	public ResponseEntity<?> method() {
		// Create a ResponseEntity with the status and body
		return ResponseEntity.status(HttpStatus.OK).body("hello");
	}
}
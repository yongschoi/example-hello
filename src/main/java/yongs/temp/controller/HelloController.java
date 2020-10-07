package yongs.temp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hi")
    public String hi() {
    	logger.debug("example-hello|HelloController|hi()");
    	// id 순으로 sort
    	return "Hello, Jenkins";
    }
}

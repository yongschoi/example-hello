package yongs.temp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import yongs.temp.service.UserService;
import yongs.temp.vo.User;

@RestController
@RequestMapping("/hello")
public class HelloController {
	private Logger logger = LoggerFactory.getLogger(HelloController.class);
	@Autowired
	UserService userService;

    @GetMapping("/hi")
    public String hi() {
    	logger.debug("example-hello|HelloController|hi()");
    	    	
    	return "Hello, Sample SpringBoot for Jenkins ::: v2 테스트입니다.";
    }
    
    @GetMapping("/users")
    public List<User> users() {
    	logger.debug("example-hello|HelloController|users()");
    	    	
    	return userService.findByScoreRating();
    }
    @GetMapping("/users/nonzero")
    public List<User> usersExcludeZero() {
    	logger.debug("example-hello|HelloController|usersExcludeZero()");
    	    	
    	return userService.findByScoreRatingExcludeZero();
    }
}

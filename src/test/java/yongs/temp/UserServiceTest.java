package yongs.temp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import yongs.temp.service.UserService;
import yongs.temp.vo.User;

class UserServiceTest {
	@Test
	@DisplayName("모든 사용자")
	void user_rating() {
		// Junit은 Autowired를 통해 new가 되지 않음
		UserService userService = new UserService();
		
		int expectedSize = 9;	
		List<User> list = userService.findByScoreRating();
		assertEquals(expectedSize, list.size());	
	}
	@Test
	@DisplayName("0점 사용자 제외")
	void user_rating_exclude_zero() {
		// Junit은 Autowired를 통해 new가 되지 않음
		UserService userService = new UserService();
		
		int expectedSize = 8;	
		List<User> list = userService.findByScoreRatingExcludeZero();
		assertEquals(expectedSize, list.size());	
	}
}

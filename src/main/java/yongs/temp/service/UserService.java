package yongs.temp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import yongs.temp.vo.User;

@Service
public class UserService {
    private List<User> getUsers() {
    	
    	List<User> list = new ArrayList<User>();
    	User user1 = new User("홍길동", 90);
    	list.add(user1);
    	
    	User user2 = new User("김철수", 88);
    	list.add(user2);
    	
    	User user3 = new User("Jane", 75);
    	list.add(user3);
    	
    	User user4 = new User("Billie", 95);
    	list.add(user4);
    	
    	User user5 = new User("Steven", 45);
    	list.add(user5);
    	
    	User user6 = new User("안영희", 85);
    	list.add(user6);
    	
    	User user7 = new User("강감찬", 77);
    	list.add(user7);  
    	
    	User user8 = new User("이밍박", 0);
    	list.add(user8);  
 
    	User user9 = new User("이성계", 95);
    	list.add(user9);  
    	
    	return list;
    }
    
    public List<User> findByScoreRating() {	
    	return getUsers().stream()
    			.sorted( (a, b) -> b.getScore() > a.getScore() ? 1 : -1)
    			.collect(Collectors.toList());
    }
    
    public List<User> findByScoreRatingExcludeZero() {	
    	return getUsers().stream()
    			.filter(a -> !((Integer)a.getScore()).equals(0) )
    			.sorted( (a, b) -> b.getScore() > a.getScore() ? 1 : -1)
    			.collect(Collectors.toList());
    }
}

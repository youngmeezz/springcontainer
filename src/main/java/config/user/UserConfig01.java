package config.user;

import org.springframework.context.annotation.Bean;

import kr.co.itcen.springcontainer.user.Friend;
import kr.co.itcen.springcontainer.user.User;

public class UserConfig01 {

	@Bean
	public User user() {
		return new User(3L,"또치");
	}
	
	@Bean
	public Friend friend() {
		return new Friend("둘리");
	}
} 

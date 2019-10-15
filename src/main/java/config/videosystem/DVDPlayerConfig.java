package config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.itcen.springcontainer.videosystem.Avengers;
import kr.co.itcen.springcontainer.videosystem.DVDPlayer;
import kr.co.itcen.springcontainer.videosystem.DigitalVideoDisc;

@Configuration
public class DVDPlayerConfig {

	@Bean
	public DigitalVideoDisc avengers() {
		return new Avengers();
	}
	
	
// 일관성 없음 위에 @Bean을 안붙혀도 되고 호출 순서도 이거 먼저 실행되고 위에가 실행됨
//	@Bean
//	public DVDPlayer dvdPlayer() {
//		return new DVDPlayer(avengers());
//	}
	
	@Bean
	public DVDPlayer dvdPlayer(DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}

}

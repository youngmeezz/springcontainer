package config.videosystem;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.itcen.springcontainer.videosystem.Avengers;
import kr.co.itcen.springcontainer.videosystem.BlankDisc;


@Configuration
public class DVDConfig {

	@Bean
	public Avengers avengers() {
		return new Avengers();
	}
	
	@Bean("avengersInfinityWar")
	public BlankDisc blankDisc() {
		
		//없으니까 new로 생성자 setting부터 하기
		BlankDisc blankDisc = new BlankDisc();
		blankDisc.setTitle("Avengers Infinity War");
		blankDisc.setStudio("MARVEL");
		blankDisc.setActors(Arrays.asList("Robert Downey Jr.", "Scarlett Johansson", " Chris Evans"));
		
		return blankDisc;
	}
	
}

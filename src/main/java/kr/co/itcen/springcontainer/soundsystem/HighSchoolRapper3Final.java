package kr.co.itcen.springcontainer.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class HighSchoolRapper3Final implements CompactDisc {
		
		private String title = "지구멸망";
		private String artist = "양승호";
		
		@Override
		public void play() {
			System.out.println("Playing " + title + " by " + artist);
	}
}
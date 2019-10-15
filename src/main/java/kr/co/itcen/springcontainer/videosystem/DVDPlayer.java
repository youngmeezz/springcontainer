package kr.co.itcen.springcontainer.videosystem;

public class DVDPlayer implements DigitalVideoDisc {

	private DigitalVideoDisc digitalVideoDisc;
	
	
	//생성자 선언
	public DVDPlayer(DigitalVideoDisc digitalVideoDisc) {
		this.digitalVideoDisc = digitalVideoDisc;
	}
	
	public DigitalVideoDisc getDigitalVideoDisc() {
		return digitalVideoDisc;
	}


	public void setDigitalVideoDisc(DigitalVideoDisc digitalVideoDisc) {
		this.digitalVideoDisc = digitalVideoDisc;
	}

	public void play() {
		
	}

}

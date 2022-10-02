package org.sample;

public class AirIndia extends BusinessTemplate {

	@Override
	public void starbucksStar() {
		System.out.println("implement donut offer");
	}

	@Override
	public void ultimateSummer() {
		System.out.println("offer in airindia flight for round trip");
		
	}
	
	public static void main(String[] args) {
		AirIndia i = new AirIndia();
		i.starbucksStar();
		i.booking();
		i.ultimateSummer();
		
	}
}

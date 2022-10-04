package org.sample;

public class AirIndia2Inter implements Interface {

	@Override
	public void starbukstar() {
		System.out.println("starbuks implements");
		
	}

	@Override
	public void ultimatesummer() {
		System.out.println("offer with in india round trip");
	}

	@Override
	public void booking() {
		System.out.println("booking implements");
		
	}
	
	public static void main(String[] args) {
		AirIndia2Inter air = new AirIndia2Inter();
		air.booking();
		air.ultimatesummer();
		air.starbukstar();
		
		System.out.println("jerry");
				
	}
}

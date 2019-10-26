package com.nt.sdp;

public final class Viechle {
	private  Engine engine;

	public Viechle(Engine engine) {
		this.engine = engine;
	}
	
	public  void  journey(String source ,String dest) {
		  engine.start();
		  System.out.println("Viechle:: Journey started from ::"+source);
		  System.out.println("Viechle:: Journey is going on .... from ::"+source +" to "+dest);
		  engine.stop();
		  System.out.println("Viechle:: Journey ended at ::"+dest);
	}

}

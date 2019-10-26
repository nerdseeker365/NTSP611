package com.nt.test;

import com.nt.sdp.DieselEngine;
import com.nt.sdp.Engine;
import com.nt.sdp.PetrolEngine;
import com.nt.sdp.Viechle;

public class StrategyDPTest {

	public static void main(String[] args) {
		Engine engg=null;
		Viechle viechle=null;
		//create Dependent class obj
		//engg=new  DieselEngine();
		engg=new PetrolEngine();
		//create Target class obj haviong Dependent class obj
		viechle=new Viechle(engg);
		//invoke method
		viechle.journey("hyd","banglore");
		
		

	}

}

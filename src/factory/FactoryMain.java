package factory;

import entities.*;

public class FactoryMain {

	public static void main(String[] args) {
		
		Factory factory = new Factory();
		
		Auto auto1 = factory.make("mercedes");
				
		System.out.println( auto1.drive() );
		
		Auto auto2 = factory.make("volkswagen");
		
		System.out.println( auto2.drive() );
		
	}

}

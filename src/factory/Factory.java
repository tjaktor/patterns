package factory;

import entities.Auto;
import entities.Mercedes;
import entities.Volkswagen;

/**
 * A simple factory
 */
public class Factory {
	
	public Auto make( String name )
	{
		String newName = name.toLowerCase();
		
		switch( newName )
		{		
			case "mercedes":
				return new Mercedes();
			case "volkswagen":
				return new Volkswagen();
			default:
				throw new IllegalArgumentException();
		}
	}
	
}

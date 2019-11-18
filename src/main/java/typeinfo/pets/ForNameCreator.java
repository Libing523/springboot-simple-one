package typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {

	private static List<Class<? extends Pet>> types  = new ArrayList<Class<? extends Pet>>();

	public static String[] typeNames = {
		"typeinfo.pets.Mutt",	
		"typeinfo.pets.Pug",	
		"typeinfo.pets.EgyptianMau",	
		"typeinfo.pets.Manx",	
		"typeinfo.pets.Cymric",	
		"typeinfo.pets.Rat",	
		"typeinfo.pets.Mouse",	
		"typeinfo.pets.Hamster",	
	};
	
	private static void loader() {
		try {
			for(String name : typeNames) {
				types.add((Class<? extends Pet>) Class.forName(name));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static {
		loader();
	}
	@Override
	public List<Class<? extends Pet>> types() {
		// TODO Auto-generated method stub
		return types;
	}
	

}

package strategyexample;

import java.util.HashMap;

public class SimpleStrategy implements Strategy {
	
	private Animal animal;
	private HashMap<String, Behaviour> behaviours = new HashMap<String, Behaviour>();

	@Override
	public void execute(String command) throws NoSuchCommandException {
		command = command.toLowerCase();
		if (behaviours.containsKey(command)){
			System.out.print("I am " + animal.getName() + " the "+ animal.getClass().getSimpleName()+ ".");
			behaviours.get(command).doIt();
		}else{
			throw new NoSuchCommandException(command + " is not a valid command for a " + animal.getClass().getSimpleName());
		}
		
	}
	@Override
	public void addBehaviour(String command, Behaviour behaviour){
		behaviours.put(command.toLowerCase(), behaviour);
	}
	

	@Override
	public void setAnimal(Animal animal) {
		this.animal = animal;
		
	}
}

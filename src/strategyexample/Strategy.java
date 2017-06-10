package strategyexample;

public interface Strategy {

	public void execute(String command) throws NoSuchCommandException;
	
	public void setAnimal(Animal animal);
	
	public void addBehaviour(String command, Behaviour behaviour);
	

}

package strategyexample;


public abstract class Animal {
	
	protected String name;
	protected Strategy strategy;

	// Each animal can have its own strategy  - in this case it is a set of valid behaviours
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
		strategy.setAnimal(this);
	}
	
	// the animal should react to commands it receives here
	public void listen(String command) throws NoSuchCommandException{
		this.strategy.execute(command);
	}

	public String getName() {
		return name;
	}
}




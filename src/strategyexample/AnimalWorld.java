package strategyexample;

public class AnimalWorld {

	public static void main(String[] args) {
		
		Fox fox = new Fox("Freddie");
		Strategy foxStrategy = new SimpleStrategy();
		foxStrategy.addBehaviour("jump", new Jump());
		foxStrategy.addBehaviour("run", new Run());
		fox.setStrategy(foxStrategy);
		try {
			fox.listen("jump");
		} catch (NoSuchCommandException e) {
			System.out.println(e.getMessage());
		}
		try {
			fox.listen("run");
		} catch (NoSuchCommandException e) {
			System.out.println(e.getMessage());
		}
		try {
			fox.listen("swim");
		} catch (NoSuchCommandException e) {

			System.out.println(e.getMessage());
		}

		Salmon salmon = new Salmon("Saoirse");
		Strategy salmonStrategy = new SimpleStrategy();
		salmonStrategy.addBehaviour("swim", new Swim());
		salmonStrategy.addBehaviour("jump", new Jump());
		salmon.setStrategy(salmonStrategy);
		
		try {
			salmon.listen("swim");
		} catch (NoSuchCommandException e) {
			System.out.println(e.getMessage());
		} 
		try {
			salmon.listen("jump");
		} catch (NoSuchCommandException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			salmon.listen("run");
		} catch (NoSuchCommandException e) {
			System.out.println(e.getMessage());
		}
		
		Hare hare = new Hare("Juno");
		Strategy hareStrategy = new SimpleStrategy();
		hareStrategy.addBehaviour("jump", new Jump());
		hareStrategy.addBehaviour("run", new Run());
		hare.setStrategy(hareStrategy);;
		
		
		try {
			hare.listen("jump");
		} catch (NoSuchCommandException e) {
			System.out.println(e.getMessage());
		}
		try {
			hare.listen("run");
		} catch (NoSuchCommandException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			hare.listen("fly");
		} catch (NoSuchCommandException e) {
			System.out.println(e.getMessage());
		}
		
		Eagle eagle = new Eagle("Eddie");
		Strategy eagleStrategy = new SimpleStrategy();
		eagleStrategy.addBehaviour("fly", new Fly());
		eagle.setStrategy(eagleStrategy);;
		
		try {
			eagle.listen("jump");
		} catch (NoSuchCommandException e) {
			System.out.println(e.getMessage());
		}
		try {
			eagle.listen("run");
		} catch (NoSuchCommandException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			eagle.listen("fly");
		} catch (NoSuchCommandException e) {
			System.out.println(e.getMessage());
		}
		
		WallacesFlyingFrog flyingFrog = new WallacesFlyingFrog("Wally");
		Strategy flyingFrogStrategy = new SimpleStrategy();
		flyingFrogStrategy.addBehaviour("fly", new Fly());
		flyingFrogStrategy.addBehaviour("jump", new Jump());
		flyingFrog.setStrategy(flyingFrogStrategy);
		
		try {
			flyingFrog.listen("jump");
		} catch (NoSuchCommandException e) {
			System.out.println(e.getMessage());
		}
		try {
			flyingFrog.listen("run");
		} catch (NoSuchCommandException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			flyingFrog.listen("fly");
		} catch (NoSuchCommandException e) {
			System.out.println(e.getMessage());
		}
		
	}
}


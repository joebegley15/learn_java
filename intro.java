public class DataTypesB {
	public static void main(String[] args) {

		System.out.println(true);

	}
}

public class Variables {
	public static void main(String[] args) {

		int myNumber = 42;
		boolean isFun = true; 
		char movieRating = 'A'; 

	}
}

public class Precedence {
	public static void main(String[] args) {

		boolean riddle = !( 1 < 8 || (5 > 2 && 3 < 5));
		System.out.println(riddle);

	}
}

public class Precedence {
	public static void main(String[] args) {

		char 5 > 4 ? 'Y' : 'N';

	}
}

public class Switch {
	public static void main(String[] args) {
		
		char penaltyKick = 'L';

		switch (penaltyKick) {

			case 'L': System.out.println("Messi shoots to the left and scores!");
								break; 
			case 'R': System.out.println("Messi shoots to the right and misses the goal!");
								break;
			case 'C': System.out.println("Messi shoots down the center, but the keeper blocks it!");
								break;
			default:
				System.out.println("Messi is in position...");

		}

	}
}

public class GeneralizationsB {
	public static void main(String[] args) {

	// ( 3 >= 3 && !(true || true) )
	boolean tricky = false;

	if(2015 > 2016) {

			System.out.println("Stuck in the past...");

		}else {

			System.out.println("Upgraded to the future!");

		}
	

	int subwayTrain = 5;

		switch (subwayTrain){

			case 1 : System.out.println("This is a South Ferry bound train!");
								break; 
			case 5 : System.out.println("This is a Brooklyn bound train!");
								break;
			case 7 : System.out.println("This is a Queens bound train!");
								break;
			default:
				System.out.println("I'm not sure where that train goes...");
	
		}

	}
}

class Dog extends Animal {

  int age;
	public Dog(int dogsAge) {
  	age = dogsAge;
  }
  
  public void bark() {
    System.out.println("Woof!");
  }
  
  public void run(int feet) {
    System.out.println("Your dog ran " + feet + " feet!");
  }
  
  public int getAge(){
    return age;
  }


	public static void main(String[] args) {
		Dog spike = new Dog(7);
    spike.bark();
    spike.run(1);
    int spikeAge = spike.getAge();
    System.out.println(spikeAge);
    spike.checkStatus();
	}

}
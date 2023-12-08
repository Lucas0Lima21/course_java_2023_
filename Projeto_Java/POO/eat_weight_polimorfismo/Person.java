package eat_weight_polimorfismo;

public class Person {
	private double weight;

	public Person(double weight) {
		setWeight(weight); 
	}
	
	public void eat(Food food) {
		this.weight += food.getWeight();
	}
	

	@Override
	public String toString() {
		return "Person weight( " + weight + " ).";
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if(weight > 0) {			
			this.weight = weight;
		}
	}
	
}

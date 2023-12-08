package eat_weight_polimorfismo;

public class Eat_Test {
	public static void main(String[] args) {
		Person joao = new Person(50);
		
		Milkshake milkshake = new Milkshake(0.78);
		Apple apple = new Apple(0.25);
		
		joao.eat(apple);
		joao.eat(milkshake);
		
		System.out.println(joao);
	}

}

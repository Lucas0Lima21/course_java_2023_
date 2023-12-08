package filter;

import java.util.Objects;

public class Person {
	final String name;
	final double note;
	
	public Person(String name, double note) {
		super();
		this.name = name;
		this.note = note;
	}
	 
	public String toString() {
		return name + ", note: " + note;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, note);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name) && Double.doubleToLongBits(note) == Double.doubleToLongBits(other.note);
	}
	

}

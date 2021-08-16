
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

class Fruit{
	
	String name,color;
	int calories,price;
	public Fruit(String name, int calories, int price, String color) {
		this.name=name;
		this.calories=calories;
		this.price=price;
		this.color=color;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
	}
}
public class A9_Q1_2_3 {

	public static void main(String[] args) {
		List<Fruit> l=new ArrayList<Fruit>();
		l.add(new Fruit("apple",100,20,"red"));
		l.add(new Fruit("grapes",50,20,"green"));
		l.add(new Fruit("banana",60,10,"yellow"));
		//question-1
		System.out.println("Low calories fruit name in descending order:");
		l.stream().filter(i->i.calories<100).sorted(Comparator.comparingInt(Fruit::getCalories).reversed()).forEach(i->System.out.println(i.name));
		
		//question-2
		System.out.println("\ncolor wise fruit:");
		l.stream().sorted(Comparator.comparing(Fruit::getColor)).forEach(System.out::println);
		
		//question-3
		System.out.println("\nRed color fruit:");
		l.stream().filter(i->i.color=="red").sorted(Comparator.comparing(Fruit::getColor)).forEach(System.out::println);
		
		
	}

}

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class A8_Q3 {

	public static void main(String[] args) {
		
		Supplier<Double> randomval=()-> Math.random();
		System.out.println("Supplier interface given value :"+randomval.get());

		Consumer<Integer> show=i -> System.out.println(i);
		show.accept(100);
		
		Predicate<Integer> compare=i -> (i<15);
		System.out.println("Is number is less than 15 :" + compare.test(10));

		Function<Integer, Double> f= i -> i/2.0;
		f=f.andThen(i->i*3.0);
		System.out.println(f.apply(10));

	}

}
import java.util.*;
public class A5_Q3 {
	public static final <T> void swap (T[] a, int i, int j) {
		T t = a[i];
		a[i] = a[j];
		a[j] = t;
		}
	public static void main(String[] args) {
		Integer[] a = {10,83,9};
		System.out.println(Arrays.toString(a));
		swap(a, 0, 1);
		System.out.println(Arrays.toString(a));
	}

}

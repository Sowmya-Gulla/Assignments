import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinMaxFinderTest {
	
	MinMaxFinder m;
	
	int[] array1= {1,5,3,7,8};
	int[] array2= {76,12,54,87,23,11};
	int[] array3= {2,4,34,5,22};
	
	@BeforeEach
	void init() {
		m=new MinMaxFinder();
	}

	@Test
	void test() {
		
		int[] expected1= {1,8};
		int[] actual1=m.findMinMax(array1);
		int[] expected2= {11,87};
		int[] actual2=m.findMinMax(array2);
		int[] expected3= {2,34};
		int[] actual3=m.findMinMax(array3);
		assertArrayEquals(expected1,actual1);
		assertArrayEquals(expected2,actual2);
		assertArrayEquals(expected3,actual3);
		
	}
	
	@Test
	void testMin() {
		
		int expected1= 1;
		int actual1=m.findMin(array1);
		int expected2= 11;
		int actual2=m.findMin(array2);
		int expected3= 2;
		int actual3=m.findMin(array3);
		assertEquals(expected1,actual1);
		assertEquals(expected2,actual2);
		assertEquals(expected3,actual3);
		
	}
	
	@Test
	void testMax() {
		
		int expected1= 8;
		int actual1=m.findMax(array1);
		int expected2= 87;
		int actual2=m.findMax(array2);
		int expected3= 34;
		int actual3=m.findMax(array3);
		assertEquals(expected1,actual1);
		assertEquals(expected2,actual2);
		assertEquals(expected3,actual3);
		
	}

}

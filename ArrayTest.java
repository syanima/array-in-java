import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;

public class ArrayTest {
	@Test
	public void simpleArrays(){
		int[] elements = new int[8];
		Arrays.fill(elements,13);
		assertEquals(elements[4],13);
	}
	@Test
	public void sizeArrays(){
		int[] array1 = new int[7];
		int[] array2 = new int[4];
		assertEquals(array2.length,4);
		assertEquals(array1.length,7);
	}
	@Test
	public void addElementsInArray(){
		int [] array1 = {1,2,3,4,5,6,7,8,9,10};
		int total = 0;
		for(int element:array1)
			total+=element;
		assertEquals(total,55);
	}
	@Test
	public void addElementsOfTwoArrayWithSameSize(){
		int[] array1 = {1,2,3,4};
		int[] array2 = {11,12,13,14};
		Array array = new Array();
		int[] result = array.add(array1,array2);
		assertEquals(result.length,4);
	}
}
package practice.sort;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class SortTest {
	private static final int SIZE = 50000;
	private static void sortTest(SortDemo[] origin, SortDemo[] target, Sort algo){
		String originStr, targetStr;
		algo.sort(target);
		originStr = SortDemo.printAllValue(origin);
		targetStr = SortDemo.printAllValue(target);
		//System.out.println(originStr.equals(targetStr));
		
		//assertArrayEquals(target, origin);
		//assertFalse(Arrays.equals(origin, target));
		//System.out.println(Arrays.toString(origin) + " " + Arrays.toString(target));
		//assertEquals(Arrays.toString(origin), Arrays.toString(target));
		assertEquals(originStr, targetStr);
	}
	
	private static void setArray(SortDemo[] origin, SortDemo[] target, Sort algo){
		origin = new SortDemo[SIZE];
		target = new SortDemo[SIZE];

		for(int i=0;i<origin.length;i++){
			int number = (int)(Math.random() * (double)(SIZE*50.0));
			origin[i] = new SortDemo(number);
		}
		
		System.arraycopy(origin, 0, target, 0, SIZE);
		Arrays.sort(origin);
		
		sortTest(origin, target, algo);
	}
	
	@Test
	public void testBubbleSort() {
		SortDemo origin[] = null, target[] = null;
		setArray(origin, target, new BubbleSort());
	}
	@Test
	public void testSelectSort() {
		SortDemo origin[] = null, target[] = null;
		setArray(origin, target, new SelectSort());
	}
	@Test
	public void testInsertSort() {
		SortDemo origin[] = null, target[] = null;
		setArray(origin, target, new InsertSort());
	}
	@Test
	public void testQuickSort() {
		SortDemo origin[] = null, target[] = null;
		setArray(origin, target, new QuickSort());
	}

}

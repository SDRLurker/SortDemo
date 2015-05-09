package practice.sort;

public class SortDemo implements Comparable<SortDemo>{
	private int value;
	public SortDemo(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public int compareTo(SortDemo o) {
		int compareValue;
		if(value > o.getValue())	compareValue = 1;
		else if(value == o.getValue()) compareValue = 0;
		else compareValue = -1;
		return compareValue;
	}
	
	public static void printAllValue(SortDemo array[]){
		for(SortDemo one:array){
			System.out.print(one.getValue() + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SortDemo integers[] = new SortDemo[20];
		for(int i=0;i<integers.length;i++){
			int number = (int)(Math.random() * 100.0);
			integers[i] = new SortDemo(number);
		}
		printAllValue(integers);
		//Sort sort = new SelectSort();
		//Sort sort = new BubbleSort();
		//Sort sort = new InsertSort();
		Sort sort = new QuickSort();
		sort.sort(integers);
		printAllValue(integers);
	}





}

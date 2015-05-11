package practice.sort;

import java.util.Scanner;

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
	
	public static String printAllValue(SortDemo array[]){
		StringBuffer sb = new StringBuffer();
		for(SortDemo one:array){
			//System.out.print(one.getValue() + " ");
			sb.append(one.getValue() + " ");
		}
		System.out.println(sb.toString());
		return sb.toString();
	}

	public static void main(String[] args) {
		int menu = -1;
		while(menu != 0){
			Scanner scanner = new Scanner(System.in);
			System.out.print("소트하고자 하는 데이터 개수를 입력하세요. >>");
			int num = scanner.nextInt();
			if(num < 1)	continue;
			SortDemo integers[] = new SortDemo[num];
			Sort sort = null;
			for(int i=0;i<integers.length;i++){
				int number = (int)(Math.random() * (double)(num*50.0));
				integers[i] = new SortDemo(number);
			}
			printAllValue(integers);
			
			System.out.println("1. 버블 소트");
			System.out.println("2. 선택 소트");
			System.out.println("3. 삽입 소트");
			System.out.println("4. 퀵 소트");
			System.out.print("소트할 알고리즘을 선택하세요. (0: 종료) >>");
			
			menu = scanner.nextInt();
			switch(menu){
				case 1:
					sort = new BubbleSort();
					break;
				case 2:
					sort = new SelectSort();
					break;
				case 3:
					sort = new InsertSort();
					break;
				case 4:
					sort = new QuickSort();
					break;
				default:
					continue;
			}
		
			long before = System.currentTimeMillis();
			sort.sort(integers);
			long after = System.currentTimeMillis();
			printAllValue(integers);
			System.out.println("데이터 개수:" + num);
			System.out.println("소트 시간:" + (after - before)/1000.0);
		}
	}
}

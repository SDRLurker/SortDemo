package practice.sort;

public class BubbleSort implements Sort {

	@Override
	public void sort(Comparable[] array) {
		// TODO Auto-generated method stub
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-1;j++){
				if(array[j].compareTo(array[j+1])>0)
				{
					Comparable temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}

}

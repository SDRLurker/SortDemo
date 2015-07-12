package practice.sort;

public class SelectSort implements Sort {

	@Override
	public void sort(Comparable[] array) {
		int minidx;
		for(int i=0;i<array.length-1;i++){
			minidx = i;
			Comparable min = array[i];
			for(int j=i+1;j<array.length;j++){
				if(min.compareTo(array[j]) < 0){
					min = array[j];
					minidx = j;
				}
			}
			Comparable temp = array[i];
			array[i] = array[minidx];
			array[minidx] = temp;
		}
	}
}

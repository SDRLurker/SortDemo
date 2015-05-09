package practice.sort;

public class InsertSort implements Sort {

	@Override
	public void sort(Comparable[] array) {
		// TODO Auto-generated method stub
		int j;
		for(int i=1;i<array.length;i++){
			Comparable temp = array[i];
			j=i;
			while(j>0 && temp.compareTo(array[j-1]) < 0){
				array[j] = array[j-1];
				j--;
			}
			array[j] = temp;
			
		}
	}

}

package practice.sort;

public class QuickSort implements Sort {
	private void quickSort(Comparable[] array, int idx, int length){
		//System.out.println(idx + " " +length);
		if(length > 1){
			Comparable pivot = array[idx+length-1];
			int i = idx-1;
			int j = idx+length-1;
			Comparable temp;
			while(true){
				while(i<idx+length-1 && array[++i].compareTo(pivot) < 0);
				while(j>idx && array[--j].compareTo(pivot) > 0);
				if(i>=j)	break;
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
			temp = array[i];
			array[i] = array[idx+length-1];
			array[idx+length-1] = temp;
			//System.out.println("left : (" +length +"," + idx + "," + i +") "+ idx + " " + (i-idx));
			quickSort(array, idx, i-idx);
			
			//System.out.println("right : (" +length +"," + idx + "," + i +") " + (i+1) + " " + (length+idx-i-1));
			quickSort(array, (i+1), (length+idx-i-1));
		}
	}

	@Override
	public void sort(Comparable[] array) {
		// TODO Auto-generated method stub
		quickSort(array, 0, array.length);
	}

}

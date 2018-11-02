//Mergesort
public class Sorting {
	public void ExamSort(int[] a, int arrSize){
		if (arrSize < 2){
			return;
		}
		
		int mid = arrSize / 2;
		int[] L = new int[mid];
		int[] R = new int[arrSize - mid];
		for (int i = 0; i < mid; i++){
			L[i] = a[i];
		}
		for (int i = mid; i < arrSize; i++){
			R[i - mid] = a[i];
		}
		ExamSort(L, mid);
		ExamSort(R, arrSize - mid);
		
		merge(a, L, R, mid, arrSize - mid);
	}
	
	public void merge(int[] arr, int[] L, int[] R, int left, int right){
		int i = 0, j = 0, k = 0;
		while (i < left && j < right){
			if (L[i] < R[j]){
				arr[k++] = L[i++];
			} else {
				arr[k++] = R[j++];
			}
		}
		while (i < left){
			arr[k++] = L[i++];
		}
		while (j < right){
			arr[k++] = R[j++];
		}
	}
	
	public void printArray(int[] arr){
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		int[] a = {15, 9, 60, 44, 12, 1, 4};
		Sorting object = new Sorting();
		object.printArray(a);
		object.ExamSort(a, a.length);
		object.printArray(a);
	}

}

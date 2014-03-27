

public class Sortsx {

	
		public static void QuickSort(int[] L){
			QuickSort(L,0, L.length-1);
		}
		
		public static void QuickSort(int[] L, int left, int right){
			if (right-left < 1){
				return;
			}
			int i = partition(L, left, right);
			QuickSort(L, left, i-1);
			QuickSort(L, i+1, right);
		}
		
		public static int partition(int[] L, int left, int right){
			int index = left + (int)(Math.random()*(right-left +1));
			int pivot = L[index];
			
			int temp = L[index];
			L[index] = L[right];
			L[right] = temp;
			
			for (int i=left; i<right; i++){
				if (L[i] < pivot){
					temp = L[i];
					L[i] = L[left];
					L[left] = temp;
					left ++;
				
				}
			}
			temp = L[left];
			L[left] = L[right];
			L[right] = temp;
			return left;
		}
		
		
		
}

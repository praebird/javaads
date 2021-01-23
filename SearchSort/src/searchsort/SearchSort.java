package searchsort;

/*Q13.1 Implement following function to find an element in an unsorted array,
 *  use sequential/linear search.

 boolean linearSearch(int[] arr, int elem); // Check if "elem" is 
 present in the unsorted array or not. Return true/false.

Q13.2 Implement following function to sort the element elements of an
 array in ascending order, use Bubble Sort.
 void bubbleSort(int[] arr);

Q13.3 Implement following function to find an element in a sorted array, use binary search.
 boolean binarySearch(int[] arr, int elem); // Check if "elem" is present in the sorted array 
 or not. Return true/false.

 */

public class SearchSort {

	
	public boolean linearSearch(int[] arr, int elem) {
		int i;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==elem) {
				return true;
			}			
		}
		return false;
	}
	
	
	public void bubbleSort(int[] arr) {
		 
        int tmp = 0;  
         for(int i=0; i < arr.length; i++){  
             for(int j=1; j < (arr.length -i); j++){  
                 if(arr[j-1] > arr[j]){  
                	 tmp = arr[j-1];  
                     arr[j-1] = arr[j];  
                     arr[j] = tmp;  
                         }  
                 }  
         }
	}
	
	
	public void selectionSort(int[] arr) {
		 
		  
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }
	}
	
	
	public void InsertionSort(int[] arr) {
		for(int j=1; j < arr.length; ++j){
			int elem = arr[j];
			int i = j-1;
			while(i>=0) {
				
				if(arr[i]>elem) {
					arr[i+1] =arr[i];
				}
				else {
					
					break;
				}
				--i;
			}
			arr[i+1]= elem;
		}
		
	}
	
	
	public void merge(int arr[], int beg, int mid, int end)  
	{  
	  
	int l = mid - beg + 1;  
	int r = end - mid;  
	  
	int LeftArray[] = new int [l];  
	int RightArray[] = new int [r];  
	  
	for (int i=0; i<l; ++i)  
	LeftArray[i] = arr[beg + i];  
	  
	for (int j=0; j<r; ++j)  
	RightArray[j] = arr[mid + 1+ j];  
	  
	  
	int i = 0, j = 0;  
	int k = beg;  
	while (i<l&&j<r)  
	{  
	if (LeftArray[i] <= RightArray[j])  
	{  
	arr[k] = LeftArray[i];  
	i++;  
	}  
	else  
	{  
	arr[k] = RightArray[j];  
	j++;  
	}  
	k++;  
	}  
	while (i<l)  
	{  
	arr[k] = LeftArray[i];  
	i++;  
	k++;  
	}  
	  
	while (j<r)  
	{  
	arr[k] = RightArray[j];  
	j++;  
	k++;  
	}  
	}  
	  
	public void mergeSort(int arr[], int beg, int end)  
	{  
	if (beg<end)  
	{  
	int mid = (beg+end)/2;  
	mergeSort(arr, beg, mid);  
	mergeSort(arr , mid+1, end);  
	merge(arr, beg, mid, end);  
	}  
	}
	

	public void QuickSort(int[] arr,int startPos, int endPos) {
		
		if((endPos - startPos + 1) <= 1) {
			
			return;
		}
		
		int pivote = startPos;
		
		int left = startPos + 1;
		int right= endPos;
		
		while(left <= right) {
			while ((left <= right) && (arr[left] < arr[pivote]))
			{
				++left;
				}
			while ((left <= right) && (arr[pivote] < arr[right])) --right;
							
		
		
		if (left < right) {
			int t = arr[left];
			arr[left] = arr[right];
			arr[right] = t;
		}
		}
		int p = arr[pivote];
		arr[pivote] = arr[right];
		arr[right] = p;
		
		QuickSort(arr,startPos, right-1);
		QuickSort(arr,right+1, endPos);
		
	}
	
	public void heapSort(int [] arr) {
		int n = arr.length;
		for(int i = n/2 ;i>=1 ;--i) {
			
			heapify(arr,n,i);
			
		}
		
		for(int i = n ;i>=1 ;--i) {
			
			int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,1);
			
		}
		
	}
	void heapify(int arr[], int i,int n)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr,  largest, n);
        }
    }
	/*
	public void convertToHeap(int [] arr, int root,int n) {
		
		int maxValue = root;
		int lchild = 2*root;
		int rchild = 2*root+1;
		
		if(rchild <= n) {
			
			if( arr [rchild] > arr[maxValue] ) {
				
				
				maxValue = rchild;
				
				
			}
			
		}
		
		if(lchild <= n) {
			
			if( arr [lchild] > arr[maxValue] ) {
				
				
				maxValue = lchild;
				
				
			}
			
		}
		
		if(maxValue != root) {
			int tmp = arr[root];
			 root = arr[maxValue];
			 arr[maxValue] = tmp;
		
		convertToHeap(arr,maxValue,n);
		}
	}

	*/
	public boolean binarySearch(int[] arr, int elem) {
	int l = 0;
	int r = arr.length-1;
	
	while (l <= r) { 
		
        int m = l + (r - l) / 2; 
 
        // Check if x is present at middle 
        if (arr[m] == elem) 
        	return true;
  
        // If x greater, ignore left half 
        if (arr[m] < elem) 
            l = m + 1; 
  
        // If x is smaller, ignore right half 
        else
            r = m - 1; 
    } 
  
		return false; 
	
	   
}
	
	public void showArr(int [] arr) 
	{
	
		for(int i =0 ; i<arr.length;i++)
		{
			System.out.print(" "+arr[i]+" ");
		}
		System.out.println("\n");
	}
	
	
}

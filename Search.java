public class Search {
	
	public int linearSearch(double[] array, double key, int begin, int end){
		int index;
		for ( index= begin ; index <= end; index++)
		{
			if (array[index] == key) 
			{ 
				return index;
			}
		}
		return -1;
	}
	
	public int binarySearch(double[] sortedArray, double key, int begin, int end)
	{
		while (begin <= end) 
		{
			int middle = (begin + end )/2 ;
			if (sortedArray[middle] < key)
				begin = middle + 1;
			if (sortedArray[middle] > key)
				end = middle - 1;
			if (sortedArray[middle] == key)
				return middle;
		}
		return -1;
	
	}
	
	public int search(double[] array, double key, int begin, int end){
		int result = linearSearch(array, key, begin, end);
		return result;
	}
	
}

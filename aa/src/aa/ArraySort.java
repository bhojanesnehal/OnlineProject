package aa;

public class ArraySort {
public static void main(String[] args) {
	int arr[]={9,5,4,6,3,1}; // 843169 431689 314689 134689
	
	for(int i=0; i<arr.length; i++)
	{
	for(int  j=i+1; j<arr.length; j++)
	{
	/*
	* If there is a smaller element towards right of the array then swap it.
	*/
	if(arr[j] < arr[i])
	{
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
	}
	}
	}
		for(int k=0;k<arr.length;k++)
		{
		System.out.print(arr[k]+" ");
		}
	}
	
}


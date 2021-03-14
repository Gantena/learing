
public class BubbleSort {

	public static void main(String[] args) {
     BubbleSort a=new BubbleSort();
     
     int [] arr= {3,5,1,2,6,4};
     
     bubbleSort(arr);
     System.out.println("Sorted Array");
//     a.value(arr);
     System.out.println(arr[0]);
     System.out.println(arr[1]);
     System.out.println(arr[2]);
	}
	
	 static void bubbleSort(int arr[])
     {
   	  for(int i=0;i<arr.length;i++)
   		  for(int j=0;j<arr.length-i-1;j++) {
   			  if(arr[j]>arr[j+1]) {
   				  int temp=arr[j];
   				  arr[j]=arr[j+1];
   				  arr[j+1]=temp;
   			  }
   			  } 
   		  }
	   
   	  void value(int arr[]) {
   		  
   	for(int i=0;i<arr.length;i++) {
		 System.out.print(arr[i]+" ");
     }
 }

}

import java.util.Scanner;
  class ArrayClass{
	   private int []arr=new int[8];
  	   public void populateArray(){
   		Scanner sc=new Scanner(System.in);
   		for(int j=0;j<arr.length;j++){
    			System.out.print("Array["+j+"]=");
    			arr[j]=sc.nextInt();
    		}
	  }

	public void printOddEvenNumbers(){
 		System.out.print("Odd Numbers displayed in Array:");
   		for(int j=0;j<arr.length;j++){
    			if(arr[j]%2!=0){
    				System.out.print(arr[j]+" ");
     			}
		}
		System.out.println();
  		System.out.print("Even Numbers displayed in Array:");
 		for(int j=0;j<arr.length;j++){
    			if(arr[j]%2==0){
    				System.out.print(arr[j]+" ");
         		}
     		}
	}
}
public class UseArrayClass{
  public static void main(String args[]){
  ArrayClass obj=new ArrayClass();
  obj.populateArray();
  obj.printOddEvenNumbers();
  }
}

package Array;

public class PracticeArray4 {
	public static void main(String[] args) {
		int arr[] = {12,20,31,40,36,60,45,85,95,98};
		
		System.out.print("All numbers: ");
		for (int i =0; i<arr.length; i++)
		System.out.print(arr[i]+" ");
		
		System.out.print("\nAll numbers in rverse: ");
        for (int i = arr.length-1; i >= 0; i--) {   // reverse loop
            System.out.print(arr[i] + " ");  
        } 
	}
}

package array;

import java.util.Scanner;

public class TestClass06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {10, 54, 13, 17, 25, 30};
		
		String str;
		System.out.print("짝수, 홀수 입력 : ");
		str = sc.next();
		
		for(int i=0; i<arr.length; i++) {					
			if(str.equals("짝수")) {
				if(arr[i]%2==0) {
					System.out.println(arr[i]);
				}
			} else {
				if(arr[i]%2!=0) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
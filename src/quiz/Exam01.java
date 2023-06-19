package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arr = new ArrayList<>();
		
		int n, sel, index;
		String name;
		
		
		System.out.print("길이 >> ");
		n = sc.nextInt();
			
		System.out.println("입력 >> ");
		
		for(int i=0; i<n; i++) {
			String msg = sc.next();
			arr.add(msg);
		}
		
		while(true) {
			System.out.println();
			System.out.println(arr);
			
			System.out.println("-- 선택 --");
			System.out.println("1. 변경");
			System.out.println("2. 삭제");
			System.out.println("3. 나가기");
			sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.print("변경할 인덱스 >> ");
				index = sc.nextInt();
				
				if(index>=0 && index<arr.size()) {				
					System.out.print("변경할 내용 >> ");
					name = sc.next();
					arr.set(index, name);
					System.out.println("변경 후 : "+arr);
				} else {
					System.out.println("인덱스 범위를 벗어났습니다.");
				}
				
			} else if(sel == 2) {
				System.out.print("삭제할 내용 >> ");
				name = sc.next();
				
				for(int i=0; i<arr.size(); i++) {
					if(name.equals(arr.get(i))) {
						arr.remove(name);
						System.out.println("삭제 후 내용 : "+arr);
					} else if(i==arr.size()-1){
						System.out.println("없는 내용입니다.");
					}
				}
			} else if(sel == 3) {
				System.out.println("--- 프로그램 종료 ---");
				break;
			}
		}
	}
}
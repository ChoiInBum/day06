package array;

import java.util.Scanner;

public class TestClass08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] id = new String[5];
		String[] pwd = new String[5];
		
		String userid, userpwd;
		
		int num;
				
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 모든회원보기");
			System.out.println("4. 나가기");
			System.out.print(">>> ");
			
			num = sc.nextInt();
			
			for(int i=0; i<id.length; i++) {			
				if(num==1) {
					System.out.print("id 입력 >> ");
					userid = sc.next();
					System.out.print("pwd 입력 >> ");
					userpwd = sc.next();
					
					if(userid.equals(id[i])) {
						System.out.println("존재하지 않는 아이디입니다.");
					} 
					
					if(id[i].equals(id) && pwd[i].equals(null)) {
						System.out.println("비밀번호가 틀립니다.");
					}
				} else if(num==2) {
					
				} else if(num==3) {
					break;
				}
			}
		}
	}
}
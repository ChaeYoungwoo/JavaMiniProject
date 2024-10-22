package com.pcwk.ehr.user;

import java.util.Scanner;

public class DeleteAcc {

	RequestAdmin reqAdmin = new RequestAdmin();
	AccountDao dao = new AccountDao();
	Scanner scanner = new Scanner(System.in);
	
	public DeleteAcc() {
		
	}
	
	public void deleteMenu() {
		System.out.println("===== 계좌 삭제 =====");
		int input = 0;
		do {
			System.out.println("사용자 계좌 삭제 요청이 있습니다.");
			System.out.println();
			dao.displayLoginAccInfo();
			
			System.out.println("삭제 하시겠습니까?");
			System.out.println("1번 - YES");
			System.out.println("0번 - NO");
			input = scanner.nextInt();
			
			switch(input) {
			case 1:
				deleteAcc();
				input = 0;
			case 2:
				break;
			}
			
		}while(input!=0);
		
	}
	
	public void deleteAcc() {
		for(AccountVO account: AccountDao.accounts) {
			if(account.getAccountNo().equals(AccountVO.userLoginVO.getAccountNo())) {
				AccountDao.accounts.remove(account);
				System.out.println("계좌 삭제 성공");
			}
		}
	}
}

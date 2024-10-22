package com.pcwk.ehr.user;

import java.util.Scanner;

public class Menu {
	CreateAccount createAccount = new CreateAccount(); // 계좌 생성
	Login login = new Login(); // 로그인
	Deposit deposit = new Deposit(); // 입금
	RequestAdmin reqAdmin = new RequestAdmin(); // 계좌 삭제 관리자에게 요청
	ChangePw changePw = new ChangePw(); // 비밀번호 변경 (사용자)

	AccountDao dao = new AccountDao();
	Scanner scanner = new Scanner(System.in);

	public void menu0() {

		int input1 = 100;
		while (input1 != 0) {
			System.out.println("====================================");
			System.out.println("┌────────────────────────┐");
			System.out.println("│ WELCOME TO             │");
			System.out.println("│ BABO BANKING SYSTEM !!!│");
			System.out.println("└────────────────────────┘");
			System.out.println("1. 관리자모드");
			System.out.println("2. 사용자모드");
			System.out.println("0. 종료");
			System.out.println("====================================");
			System.out.print("입력: ");

			input1 = scanner.nextInt();
			switch (input1) {
			case 1:
				login.adminLogin();
				if (login.isAdminLogin() == true) {
					adminMenu();
				} else {
					System.out.println("'관리자' 로그인 해주세요.");
				}
				break;
			case 2:
				userMenu();
				break;
			case 0:
				System.out.println("프로그램 종료!");
			}
		}
	}

	public void adminMenu() {

		int input2 = 0;

		do {
			System.out.println("====================================");
			System.out.println("┌────────────────────────────────┐");
			System.out.println("│  BABO BANK ADMINISTRATOR MODE  │");
			System.out.println("└────────────────────────────────┘");

			System.out.println("1. 모든 계좌 정보 조희");
			System.out.println("2. 계좌 비밀번호 변경 ");
			System.out.println("3. 계좌 삭제");
			System.out.println("0. 관리자 모드 종료");
			System.out.println("====================================");
			System.out.print("입력: ");

			input2 = scanner.nextInt();
			switch (input2) {
			case 1:
				dao.displayAllAccInfo();
				break;
			case 2:
				if (login.isAdminLogin() == true) {
					// changePw();
				} else {
					System.out.println("로그인 먼저 해주세요.");
				}
				break;
			case 3:
				if (login.isAdminLogin() == true) {
					// delteAcc();
				} else {
					System.out.println("로그인 먼저 해주세요.");
				}
				break;
			}
		} while (input2 != 0);
	}

	public void userMenu() {
		int input = 0;

		do {
			System.out.println("====================================");
			System.out.println("┌────────────────────────┐");
			System.out.println("│ WELCOME TO             │");
			System.out.println("│ BABO BANKING SYSTEM !!!│");
			System.out.println("└────────────────────────┘");

			System.out.println("1. 계좌 생성");
			System.out.println("2. 로그인");
			System.out.println("3. 입금");
			System.out.println("4. 출금");
			System.out.println("5. 송금");
			System.out.println("6. 계좌 정보 조회");
			System.out.println("7. 계좌 비밀번호 변경");
			System.out.println("8. 계좌 삭제 (관리자에게 요청)");
			System.out.println("0. 사용자 모드 종료");
			System.out.println("====================================");
			System.out.print("입력: ");
			input = scanner.nextInt();

			switch (input) {
			case 1: // 계좌 생성
				createAccount.createAccount();
				break;
			case 2: // 로그인

				login.userLogin();
				break;

			case 3: // 입금
				if (login.IsUserLogin() == true) {
					deposit.deposit();
				} else {
					System.out.println("로그인 먼저 해주세요.");
				}
				break;

			case 4: // 출금
//				if (getIsLogin() == true) {
//					withdraw();
//				} else {
//					System.out.println("로그인 먼저 해주세요.");
//				}
//				break;
			case 5:
//				// 송금 함수
//				if (getIsLogin() == true) {
//					transfer();
//				} else {
//					System.out.println("로그인 먼저 해주세요.");
//				}
			case 6:
				// 계좌 정보 조회 함수
				if (login.IsUserLogin() == true) {
					dao.displayLoginAccInfo();
				} else {
					System.out.println("로그인 먼저 해주세요.");
				}
				break;
			case 7:
				// 비밀번호 변경 (사용자)
				if (login.IsUserLogin() == true) {
					changePw.userChangePw();
				} else {
					System.out.println("로그인 먼저 해주세요.");
				}
				break;

			case 8:
				// 계좌 삭제 (관리자에게 요청)
				if (login.IsUserLogin() == true) {
					reqAdmin.requestAdmin();
				} else {
					System.out.println("로그인 먼저 해주세요.");
				}
				break;
			case 0:
				// 사용자 모드 종료
				System.out.println("메인 메뉴로 돌아갑니다.");
				break;
			}

		} while (input != 0);

	}

}

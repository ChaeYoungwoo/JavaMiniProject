package com.pcwk.ehr.user;

import java.util.Scanner;

public class ChangePw {
	Scanner scanner = new Scanner(System.in);

	public ChangePw() {

	}

	public void userChangePw() {
		System.out.println("===== 계좌 비밀번호 변경 =====");
		System.out.println("계좌 비밀번호 변경을 위해서 정보를 입력해주세요.");
		System.out.print("계좌 소유주명을 입력해주세요: ");
		String inputName = scanner.nextLine();

		System.out.print("생년월일을 입력하세요: ");
		String inputDob = scanner.nextLine();

		System.out.print("현재 비밀번호를 입력하세요: ");
		String inputPw = scanner.nextLine();

		System.out.print("새 비밀번호를 입력하세요: ");
		String newPw = scanner.nextLine();

		if (inputName.equals(AccountVO.userLoginVO.getUserName()) && inputDob.equals(AccountVO.userLoginVO.getUserDob())
				&& inputPw.equals(AccountVO.userLoginVO.getUserPw())) {
			AccountVO.userLoginVO.setUserPw(newPw);
			System.out.println("비밀번호 변경 성공!");
		} else {
			System.out.println("입력하신 정보가 일치하지 않습니다. 다시 시도해주세요.");
		}
		
		System.out.println(AccountVO.userLoginVO.getUserPw());
	}
	
	public void adminChangePw() {
		
	}

}

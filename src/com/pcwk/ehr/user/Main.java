package com.pcwk.ehr.user;

public class Main {

	public static void main(String[] args) {
		String fileName = "accounts.txt"; // accounts.txt(계좌 정보 들어있는 파일)
		AccountDao dao = new AccountDao();
		dao.readFile(fileName);
//		dao.displayAllAccInfo();
		Menu menu = new Menu();
		menu.menu0();
		
		
	}

}

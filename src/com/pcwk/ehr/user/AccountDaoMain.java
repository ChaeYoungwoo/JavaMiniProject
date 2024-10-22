//package com.pcwk.ehr.user;
//
//public class AccountDaoMain {
//
//	AccountVO account = null;
//	AccountDao dao = null;
//
//	public AccountDaoMain() {
//
////		dao = new AccountDao();
////		account = new AccountVO("99991005", "후두부", "1234","20001003", "99999999", "사용자", 13000); // "99991001", "후두부", "1234",
//																						// "99999999", "사용자", 13000 인자값
//																						// 예
//	}
//
//	public void doSave() {
//		System.out.println("-----------------------");
//		System.out.println("회원 등록");
//		int flag = dao.doSave(account);
//
//		if (2 == flag) {
//			System.out.println(account.getAccountNo() + "계좌번호 중복, 문제가 있습니다. 등록할 수 없습니다."); // memberID처럼 ID로써 기능이 조금 애매함
//																							// 추후 상의하고싶음.
//		} else if (0 == flag) {
//			System.out.println(account.getAccountNo() + "등록 실패!");
//		} else {
//			System.out.println(account.getAccountNo() + " 등록 성공!");
//		}
//		dao.displayList(AccountDao.accounts); // 되나 안 되나 해본 라인 추후에 지울 예정
//		System.out.println("-----------------------");
//	}
//
//	public void doDelete() {
//		System.out.println("회원 삭제");
//		int flag = dao.doDelete(account);
//
//		if (1 == flag) {
//			System.out.println(account.getAccountNo() + "삭제 성공");
//		} else {
//			System.out.println(account.getAccountNo() + "삭제 실패"); // list에 동일한 accountNo를 가진 계좌가 없을 때
//		}
//		dao.displayList(AccountDao.accounts);
//	}
//
//	public void doSelectOne() {
//		System.out.println("회원 조회");
//		AccountVO outVO = dao.doSelectOne(account);
//		
//		if(null == outVO) {
//			System.out.println(account.getAccountNo() +" 회원이 존재하지 않습니다.");
//		}else {
//			System.out.println(outVO +" 조회 성공!");
//			
//		}
//		
//	}
//	
//	public static void main(String[] args) {
//		AccountDaoMain main = new AccountDaoMain();
//		main.doSave(); // 계좌 등록
////		main.doDelete(); // 계좌 삭제
//		main.doSelectOne();
//		System.out.println(AccountDao.accounts.toString());
//
//	}
//
////}
//package com;



package com.pcwk.ehr.user;

import java.util.Calendar;
import java.util.Scanner;

public class CreateAccount {
	CatchMethod catchMethod = new CatchMethod();
	AccountDao dao = new AccountDao();
	Scanner sc = new Scanner(System.in);
	public CreateAccount() {
		
	}
	
	public AccountVO createAccount() {
		AccountVO out = null;
		System.out.println("===== 회원가입 =====");
		//계좌번호
        int ranNo = 99991000 + ((int) (Math.random() * 100 + 1));
        String accNo = Integer.toString(ranNo); 

        //소유주명
        System.out.print("본인의 이름을 입력하세요: ");
        String userName=sc.nextLine();
        catchMethod.check_Input(userName,"이름","계좌생성");


        //생년월일
        System.out.print("본인의 생년월일을 입력하세요: ");
        String userDob = sc.nextLine();// 생년월일
        catchMethod.check_Input(userDob,"생년월일","계좌생성");
        
        //비밀번호
        System.out.print("설정하실 비밀번호를 입력하세요: ");
        String userPw = sc.nextLine();
        catchMethod.check_Input(userPw,"비밀번호","계좌생성");

        //가입일
        Calendar calendar =  Calendar.getInstance();
        String currentDate = String.format("%02d/%02d/%02d", calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
        String regDt = currentDate;

        //권한명
        String roleName = "사용자";
        
        //잔고
        System.out.print("초기 입금액을 입력하세요: ");
        String initBalance = sc.nextLine();
        catchMethod.check_Input(initBalance,"금액","계좌생성");
        double balance = Double.parseDouble(initBalance);

        out = new AccountVO(accNo, userName, userPw, userDob, regDt, roleName, balance);
        
        System.out.println("********** 계좌 생성 완료! **********");
        System.out.println("계좌번호: " + out.getAccountNo());
        System.out.println("소유주명: " +out.getUserName());
        System.out.println("비밀번호: " +out.getUserPw());
        System.out.println("생년월일: " +out.getUserDob());
        System.out.println("가입일: " +out.getRegDt());
        System.out.println("권한명: " +out.getRoleName());
        System.out.println("잔고: " +out.getBalance());
        System.out.println("********************************");
        dao.doSave(out);
		return out;
	}
	
	
	
}
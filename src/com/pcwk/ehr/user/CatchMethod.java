package com.pcwk.ehr.user;

public class CatchMethod {

    public void check_Input(String input , String title){
        try{
             if(title == "이름"){
                 if (!input.matches("^[가-힣a-zA-Z]+$")){
                     System.out.println(title+"은 한글과 영어로 입력해주세요.");
                 }
                 else if (input.length()<2) {
                     System.out.println(title+"은 최소 2글자 이상을 입력해주세요.");
                 }
                 else if (input.length()>20){
                     System.out.println(title+"은 최대 20글자 까지 입력할 수 있습니다.");
                 }
             }
             if(title == "비밀번호")
                 if(!input.matches(  "^[0-9]+$")){
                     System.out.println(title+"는 숫자만 입력해주세요.");
                 }
                 else if (input.length()!=4){
                     System.out.println(title+"는 4자 입니다.");
                 }

             if(title == "생년월일"){
                 if (input.length() != 8) {
                     System.out.println("생년월일은 8자리 입니다.");
                 }
                 String year = input.substring(0, 4);
                 String month = input.substring(4, 6);
                 String day = input.substring(6, 8);
                 if(!input.matches("^[0-9]+$")){
                     System.out.println(title+"은 숫자만 입력해주세요.");
                 }  else if (!year.matches("^(19[0-9]{2}|200[0-9])$")){
                     System.out.println("혹시 나이가 몇살이신가요...");
                 }
                 else if (!month.matches("^(0[1-9]|1[0-2])$")){
                     System.out.println(month+"월은 존재하지 않습니다. 1월부터12월중 입력해주세요.");
                 }
                 else if (!day.matches("^(0[1-9]|[12][0-9]|3[01])$")){
                     System.out.println(day+"일은 존재하지 않습니다. 1일부터31일중 입력해주세요");
                 }
             }
             if(title == "금액"){
                 if(input.length()>8){
                     System.out.println(input+"원은 큰금액이라 신분증을 제출해주세요");
                 }
                 else if(!input.matches("^[1-9][0-9]{0,7}$")){
                    System.out.println(input+"원은 존재하지 않는 금액입니다. 금액은 0부터 시작할수 없습니다");
                }
             }
        }catch (Exception e) {
           System.out.println("오류가 발생했습니다.");
       }
    }
}
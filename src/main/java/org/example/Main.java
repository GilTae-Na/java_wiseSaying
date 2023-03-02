package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Myung> mList = new ArrayList<>();
        String say; String person;
        System.out.println("==명언 앱==");

        while (true) {
            System.out.printf("명령)  ");
            String order = sc.nextLine().trim();
            String result = order.substring(0,2);
            String result2 = order.substring(3,4);

            if (order.equals("종료")) {
                break;
            } else if (order.equals("등록")) {
                System.out.print("명언: ");
                say = sc.nextLine();
                System.out.print("작가: ");
                person = sc.nextLine();
                mList.add(new Myung(say, person));
                System.out.println(mList.size() + "번 명언이 등록되었습니다.");
            } else if (order.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------------");
                for(int i=mList.size()-1; i>=0;i--){
                    System.out.println((i+1) + "/" + mList.get(i).getSay() + "/" + mList.get(i).getSay());
                }
            } else if (order.equals("삭제")) {


            } else {
               System.out.println("올바른 코드를 입력하세요");
               sc.nextLine();
           }

        }
    }
}

class Myung{

    private String say;
    private  String person;

    Myung(String say, String person){
        this.say = say;
        this.person = person;
    }

    public String getSay(){
        return this.say;
    }
    public String getPerson(){
        return this.person;
    }
    public void setSay(String say){
        this.say = say;
    }
    public void setPerson(String person){
        this.person = person;
    }

}


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

            if (order.equals("종료")) {
                break;
            } else if (order.equals("등록")) {
                System.out.print("명언: ");
                say = sc.nextLine().trim();
                System.out.print("작가: ");
                person = sc.nextLine().trim();
                mList.add(new Myung(mList.size()+1, say, person));
                System.out.println(mList.size() + "번 명언이 등록되었습니다.");
            } else if (order.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------------");
                for(int i=mList.size()-1; i>=0;i--){
                    System.out.println(
                            mList.get(i).getId()+ "/" + mList.get(i).getPerson() + "/" + mList.get(i).getSay());
                }
            } else if (order.contains("삭제")) {
                int inputSayNum  = Integer.parseInt(order.replaceAll("[^0-9]", ""));
                if(mList.get(inputSayNum-1).getId() == inputSayNum){
                    mList.remove(inputSayNum-1);
                    System.out.println((inputSayNum) + "번 명언이 삭제되었습니다.");
                }else System.out.println((inputSayNum)+ "번 명언은 존재하지 않습니다.");
            } else {
               System.out.println("올바른 코드를 입력하세요");
               sc.nextLine();
           }

        }
    }
}

class Myung{
    private long id;
    private String say;
    private  String person;

    Myung(long id, String say, String person){
        this.id = id;
        this.say = say;
        this.person = person;
    }
    public long getId(){
        return this.id;
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


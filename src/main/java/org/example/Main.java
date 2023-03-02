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
            String order = sc.nextLine();

            if (order.equals("종료")) {
                break;
            } else if (order.equals("등록")) {
                System.out.print("명언: ");
                say = sc.nextLine();
                System.out.print("작가: ");
                person = sc.nextLine();
                mList.add(new Myung(say, person));
            }
           else {
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
}


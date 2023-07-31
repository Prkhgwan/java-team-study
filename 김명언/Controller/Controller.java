package 팀장문제.김명언.Controller;

import 팀장문제.김명언.CRUD.CRUD;

import java.util.Scanner;

public class Controller {
    public void controller () {
        boolean flag = true;
        CRUD crud = new CRUD();
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        while (flag) {
            System.out.println("명령");
            String order = sc.nextLine();
            switch (order) {
                case "종료":
                    System.out.println("종료합니다");
                    flag = false;
                    break;
                case "등록":
                    while (true) {
                        crud.create();
                        break;
                    }
                    break;
                case "목록":
                    crud.read();
                    break;
                case "삭제":
                    crud.delete();
                    break;
                case "수정":
                    crud.update();
                    break;
            }
        }
    }
}

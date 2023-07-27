package 팀장문제.김명언.Quiz3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;

        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.println("명령");
            String order = sc.nextLine();
            switch (order) {
                case "종료":
                    System.out.println("종료합니다");
                    return;
                case "등록":
                    while(true) {
                        String cowsay;
                        String author;
                        System.out.println("명언 : ");
                        cowsay = sc.nextLine();
                        System.out.println("작자 : ");
                        author = sc.nextLine();
                        break;
                    }
                    System.out.println(i++ + "번 명언이 등록되었습니다.");
            }
        }
    }
}

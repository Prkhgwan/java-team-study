package 팀장문제.김명언.Quiz1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("== 명언 앱 ==");
            System.out.println("명령)");
            String order = sc.nextLine();
            switch (order) {
                case "종료":
                    System.out.println("종료합니다");
                    return;
            }
        }
    }
}


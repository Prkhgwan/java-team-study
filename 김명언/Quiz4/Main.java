package 팀장문제.김명언.Quiz4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String>[] cowsays = new ArrayList[100];
        int num = 1;

        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.println("명령");
            String order = sc.nextLine();
            switch (order) {
                case "종료":
                    System.out.println("종료합니다");
                    return;
                case "등록":
                    while (true) {
                        String cowsay;
                        String author;
                        System.out.println("명언 : ");
                        cowsay = sc.nextLine();
                        
                        System.out.println("작자 : ");
                        author = sc.nextLine();
                        break;
                    }
                    System.out.println(num++ + "번 명언이 등록되었습니다.");
                case "목록":
                    System.out.println("번호    작자    명언");
                    System.out.println("==================");
                    break;
            }
        }
    }
}


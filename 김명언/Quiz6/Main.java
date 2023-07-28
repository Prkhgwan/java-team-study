package 팀장문제.김명언.Quiz6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class cowsays {
    int number;
    String cowsay;
    String author;
}

class CRUD {
    List<cowsays> thecowsay = new ArrayList<cowsays>();
    Scanner input = new Scanner(System.in);

    public void create() {
        cowsays says = new cowsays();

        int no = thecowsay.size() + 1;
        System.out.println("명언 : ");
        String cowsay = input.nextLine();
        System.out.println("작자 : ");
        String author = input.nextLine();
        System.out.println(no + "번 명언이 등록되었습니다.");

        says.number = no;
        says.cowsay = cowsay;
        says.author = author;

        thecowsay.add(says);
    }

    public void read() {
        for (int i = 0; i < thecowsay.size(); i++) {
            System.out.println("번호    작자    명언");
            System.out.println("==================");
            System.out.println(thecowsay.get(i).number + "   " + thecowsay.get(i).author + "   " + thecowsay.get(i).cowsay);
        }
    }

    public void delete() {
        System.out.println("삭제할 정보 id를 입력해 주세요.");
        int number = input.nextInt();
        try {
            if(thecowsay.get(number-1)!=null) {
                thecowsay.remove(number - 1);
                System.out.println(number + "번 명언이 삭제되었습니다.");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(number + "번 명언은 존재하지 않습니다.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
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
            }
        }
    }
}

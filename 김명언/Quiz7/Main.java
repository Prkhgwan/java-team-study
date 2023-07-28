package 팀장문제.김명언.Quiz7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class cowsays {
    int number;
    String cowsay;
    String author;

    public cowsays(int number, String cowsay, String author) {
        this.number = number;
        this.cowsay = cowsay;
        this.author = author;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCowsay() {
        return cowsay;
    }

    public void setCowsay(String cowsay) {
        this.cowsay = cowsay;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class CRUD {
    List<cowsays> thecowsay = new ArrayList<cowsays>();
    Scanner input = new Scanner(System.in);

    public void create() {
        int no = thecowsay.size() + 1;
        System.out.println("명언 : ");
        String cowsay = input.nextLine();
        System.out.println("작자 : ");
        String author = input.nextLine();
        System.out.println(no + "번 명언이 등록되었습니다.");

        cowsays says = new cowsays(no,cowsay,author);
        thecowsay.add(says);
    }

    public void read() {
        System.out.println("번호    작자    명언");
        System.out.println("==================");
        for (int i = 0; i < thecowsay.size(); i++) {
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

    public void update() {
        System.out.println("수정할 정보 id를 입력하세요.");
        int number = Integer.parseInt(input.nextLine());
        System.out.println(thecowsay.get(number-1).number + "   " + thecowsay.get(number-1).author + "   " + thecowsay.get(number-1).cowsay);
        System.out.println("명령을 입력하세요");
        while (true) {
            System.out.println("명령");
            System.out.println("1. 작가 수정");
            System.out.println("2. 명언 수정");
            System.out.println("3. 취소");
            Scanner edit = new Scanner(System.in);
            String editorder = edit.nextLine();
            switch (editorder) {
                case "작가 수정" :
                    System.out.println("작자(기존) : " + thecowsay.get(number-1).author);
                    System.out.println("작자");
                    String authortmp = input.nextLine();
                    String cowsays = thecowsay.get(number-1).cowsay;
                    cowsays says = new cowsays(number,cowsays,authortmp);
                    thecowsay.set(number-1,says);
                    break;
                case "명언 수정" :
                    System.out.println("명언(기존) : " + thecowsay.get(number-1).cowsay);
                    System.out.println("명언");
                    String saytmp = input.nextLine();
                    String author = thecowsay.get(number-1).author;
                    says = new cowsays(number,saytmp,author);
                    thecowsay.set(number-1,says);
                    break;
                case "취소" :
                    System.out.println("수정을 취소합니다");
                    return;
            }
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
                case "수정":
                    crud.update();
                    break;
            }
        }
    }
}

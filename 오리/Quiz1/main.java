package 팀장문제.오리.Quiz1;
// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : `Breath` 기능을 중복하지 말아주세요.

class Main {
    public static void main(String[] args) {
        Man man = new Man();
        man.breath();
    }
}
class Animal {
    void breath() {
        System.out.println("숨쉬다.");
    }
}

class Man extends Animal {}
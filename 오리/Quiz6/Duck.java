package 팀장문제.오리.Quiz6;

public class Duck {
    void fly() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class ThunderDuck extends Duck {}

class WhiteDuck extends Duck {}

class RubberDuck extends Duck {
    @Override
    void fly() {
        System.out.println("저는 날 수 없어요. ㅜㅠ");
    }
}

class RubberDuck2 extends RubberDuck {}
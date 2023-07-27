package 팀장문제.오리.Quiz7;

abstract class Duck {
    FlyItem flyItem = new CanFlyItem();

    void fly() {
        flyItem.Action();
    }
}

class ThunderDuck extends Duck {}

class WhiteDuck extends Duck {}

class RubberDuck extends Duck {
    FlyItem flyItem = new DisFlyItem();

    void fly() {
        flyItem.Action();
    }
}

class RubberDuck2 extends RubberDuck {}

abstract class FlyItem {
    void Action () {
    }
}
class CanFlyItem extends FlyItem {
    void Action () {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class DisFlyItem extends FlyItem {
    void Action () {
        System.out.println("저는 날 수 없어요. ㅜㅠ");
    }
}

class Rocket extends FlyItem {
    void Action () {
        System.out.println("러버덕이 로켓으로 날아갑니다.");
    }
}

class ExtendWing extends FlyItem {
    void Action () {
        System.out.println("러버덕이 확장날개로 날아갑니다.");
    }
}

class Magic extends FlyItem {
    void Action () {
        System.out.println("러버덕이 마법으로 날아갑니다.");
    }
}
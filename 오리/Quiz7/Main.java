package 팀장문제.오리.Quiz7;

/* 가정
우리는 게임개발회사에 입사했다.
우리에게는 성격좋은 사수 한명이 있다.
내가 개발할 게임은 오리시뮬레이션 게임이다.
선임이 나의 개발을 도와주진 않지만 조언은 해준다.
*/

/* 요구사항
- D1 요구 : 오리를 생성하고 날게하시오.

- D2 요구 : 게임의 디테일을 살리기 위해서 `thunderDuck `과 `whiteDuck `를 생성하고 날게하시오.

- D3 요구 : 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.

- D4 요구 : 게임의 재미를 위하여 고무오리를 추가하고 날게 하시오.

- D5 요구 : 주말 주주회의에서 고무오리가 하늘을 날아다니는 것에 대해서 태클이 들어왔습니다.
 고무오리 계열은 하늘을 날 수 없게 해주세요.

- D6 요구 : 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날게 해주세요.

- D7 요구 : 고무오리계열에서 날다 메서드의 중복을 제거해주세요.

- D8 요구 : 자바에서 다중상속은 불가능 합니다. 상속에는 한계가 있습니다. 복잡한 상속을
 사용하지 않고 고무오리계열의 중복을 제거해주세요.
  - 복잡한 상속을 사용하지 않는다는 것의 의미 : 모든 오리 계열 클래스들은 부모클래스가
 오리 클래서 여야 한다.
- D9 요구 : 현질기능을 추가한다. 로켓비행아이템을 추가하세요.
*/

class Main {
    public static void main(String[] args) {
        ThunderDuck thunderDuck = new ThunderDuck();
        thunderDuck.fly();
        // 출력 : 오리가 날개로 날아갑니다.

        WhiteDuck whiteDuck = new WhiteDuck();
        whiteDuck.fly();
        // 출력 : 오리가 날개로 날아갑니다.

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.fly();
        // 출력 : 저는 날 수 없어요. ㅜㅠ

        RubberDuck2 rubberDuck2 = new RubberDuck2();
        rubberDuck2.fly();
        // 출력 : 저는 날 수 없어요. ㅜㅠ

        rubberDuck2.flyItem = new Rocket();
        rubberDuck2.fly();
        // 출력 : 러버덕이 로켓으로 날아갑니다.
        rubberDuck2.flyItem = new ExtendWing();
        rubberDuck2.fly();
        // 출력 : 러버덕이 확장날개로 날아갑니다.
        rubberDuck2.flyItem = new Magic();
        rubberDuck2.fly();
        // 출력 : 러버덕이 마법으로 날아갑니다.
    }
}


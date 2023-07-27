package 팀장문제.오리.Quiz4;

/* 가정
우리는 게임개발회사에 입사했다.
우리에게는 성격좋은 사수 한명이 있다.
내가 개발할 게임은 오리시뮬레이션 게임이다.
선임이 나의 개발을 도와주진 않지만 조언은 해준다.
*/

/* 요구사항
- D1 요구 : 오리를 생성하고 날게하시오.

- D2 요구 : 게임의 디테일을 살리기 위해서 `thunderDuck `와 `whiteDuck `를 생성하고 날게하시오.

- D3 요구 : 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.

- D4 요구 : 게임의 재미를 위하여 고무오리를 추가하고 날게 하시오.
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
    }
}
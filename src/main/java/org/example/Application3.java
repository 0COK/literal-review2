package org.example;

public class Application3 {
    public static void main(String[] args) {
        // 문자열 합치기 결과를 예측하고 사용할 수 있다.
        // 1. 두 개의 문자열 합치기
        System.out.println("==== 두 개의 문자열 합치기 ====");
        System.out.println(9 + 9);
        System.out.println("9" + 9);        // 문자열로 합쳐짐
        System.out.println(9 + "9");        // 문자열이기 때문에 구구라고 읽음
        System.out.println("9" + "9");

        // 2. 세 개의 문자열 합치기
        System.out.println("==== 세 개의 문자열 합치기 =======");
        System.out.println(9 + 9 + "9");    // 플러스의 연산 방향은 왼쪽부터
        System.out.println(9 + "9" + 9);
        System.out.println("9" + 9 + 9);
        System.out.println("9" + (9 + 9));

        System.out.println("10과 20의 합 : " + (10 + 20));      // 괄호를 묶지 않으면 문자열로 출력
        System.out.println("10과 20의 차 : " + (10 - 20));
        System.out.println("10과 20의 곱 : " + (10 * 20));
        System.out.println("10과 20의 나누기 한 몫 : " + (10 / 20));
        System.out.println("10과 20의 나누기 한 나머지 : " + (10 % 20));

        System.out.println("기차");
        System.out.println("기차" +"칙칙폭폭");
        System.out.println("기차" + 123 + 45 + "출발");
        System.out.println(123 + 45 + "기차" + "출발");


    }
}

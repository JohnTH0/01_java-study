package com.seungjoo.section05.logical;

public class Application2 {
    public static void main(String[] args) {

        // 특정 정수값이 1부터 100사이의 값인지 판별
        int num = 50;

        boolean result = (num >= 1) && (num <= 100);

        System.out.println("정수값이 1~100 사이의 숫자입니까 : " + result);

    }
}

package com.podoseee.section04.run;

import com.podoseee.section04.dto.Book;

import java.sql.SQLOutput;

public class Application2 {
    public static void main(String[] args) {
        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println("book1: " + book1);
        System.out.println("book2: " + book2);

        System.out.println("두 인스턴스의 == 비교: " + (book1 == book2)); // 주소값 비교
        System.out.println("두 인스턴스의 equals() 비교: " + book1.equals(book2)); // Object클래스의 equals메소드 : 주소값 비교

        /*
            ## 동일객체와 동등객체 ##
         */
    }
}

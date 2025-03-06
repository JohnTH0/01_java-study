package com.younggalee.section02.url;

import java.net.MalformedURLException;
import java.net.URL;

public class Application {
    public static void main(String[] args) {
        /*
            ## java.net.URL ##
            사용하고자하는 자원(리소스)에 대한 위치(포인터)를 나타냄

         */
        try {
            URL url = new URL("http://www.example.com:8080/blog/list?page=1&sort=DESC#memo");

            // URL 파싱하기
            System.out.println(url.getProtocol()); //http
            System.out.println(url.getHost());//www.example.com
            System.out.println(url.getPort());//8080
            System.out.println(url.getPath());//  /blog/list
            System.out.println(url.getQuery());//  page=1&sort=DESC
            System.out.println(url.getRef());// memo

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

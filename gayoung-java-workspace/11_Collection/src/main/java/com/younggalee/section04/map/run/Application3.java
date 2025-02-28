package com.younggalee.section04.map.run;

import com.younggalee.section04.map.dto.Snack;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Application3 {

    /*
        ##java.util.Properties ##
        1. Map을 구현하고 있는 클래스이므로 Map의 특징을 가지고 있음
        2. 주고 Properties 내의 데이터를 .properties 또는 .xml파일로 입출력할 때 사용
        3. .properties, .xml 파일의 특징
            1) 키, 밸류를 텍스트의 형태로 작성해둘 수 있는 파일
            2) 주로 프로그램의 환경설정(ip주소, dbmsd경로 등..) 관련 내용을 작성해두고
               자바 프로그램상으로 해당 내용을 읽어들여서 사용함
               >> 환경설정 구문이 외부 파일에 기록되어있어서 자바코드를 수정할 필요없이 파일만 열어 수정할 수 있음
               >> 자바코드가 아니고 직관적으로 알아보기 쉬운 파일이므로 굳이 개발자가 아닌 일반인도 관리할 수 있음
        4. 따라서 위와 같은 파일로 데이터 입출력시 키, 밸류 모두 String으로 작업해야됨
           >> setProperty(), getProperty() 메소드를 주로 사용
     */
    public static void main(String[] args) {
        Properties prop = new Properties();

        // setProperty(String key, String value) : 속성취급
        prop.setProperty("List", "ArrayList");
        prop.setProperty("Set", "HashSet");
        prop.setProperty("Map", "HashMap");
        prop.setProperty("Map", "Properties"); // key 같아서 덮어씌어짐

        System.out.println(prop);

        try {
            // * store(OutputStream os, String comment) : Properties에 담겨있는 key-value들을 문자열 변환해서 파일로 출력
            prop.store(new FileOutputStream("test.properties"), "properties Test");

            // storeToXML(OutputStream os, String comment) : .xml 파일로 저장시키고자 할 경우
            prop.storeToXML(new FileOutputStream("test.xml"),"propertiesTest");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

package com.example.design_pattern.structural.adapter_pattern.in_java;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class AdapterInJava {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        /*
        *
        * asList -> 서로 상이한 인터페이스를 연결해준다 (배열 -> List)
        *
        * Collections.enumeration()
        * String -> Adaptee
        * Collections -> Adaptor
        * Enumeration -> Target
        *
        * Collections.List()
        *
        * */

        List<String> strings = Arrays.asList("a", "b", "c");
        Enumeration<String> enumeration = Collections.enumeration(strings);

        /*
        *
        * io
        *
        *
        * */
        try {
            InputStream is = new FileInputStream("input.txt"); // Adaptee
            InputStreamReader inputStreamReader = new InputStreamReader(is); // Adapter
            BufferedReader reader = new BufferedReader(inputStreamReader); //
        } catch (Exception e) {
            throw new RuntimeException();
        }


    }
}

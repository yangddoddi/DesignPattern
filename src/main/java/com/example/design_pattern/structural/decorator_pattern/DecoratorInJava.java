package com.example.design_pattern.structural.decorator_pattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {
    public static void main(String[] args) {
        /*
        *
        * Reader -> 목적에 따라 어댑터 패턴 혹은 데코레이터로 볼 수 있다.
        *
        * */

        /*
        *
        * Collections에 wrapping을 통해 속성을 추가하는 경우
        *
        * */

        ArrayList list = new ArrayList();
        list.add("dd");
        List list5 = Collections.checkedList(list, String.class);
        list5.add(33);
        Collection collection = Collections.unmodifiableCollection(list5);


        /*
        *
        * HttpServletRequestWrapper -> 이걸 거쳐서 원하는 기능 ㅏㅅ용할 수 있게됨
        *
        * */

        /*
        *
        * BeanDefinitionDecorator
        * ServerHttpRequestDecorator
        * ServerHttpResponseDecorator
        *
        * */
    }
}

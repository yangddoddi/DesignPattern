package com.example.design_pattern.structural.bridge_pattern;

/*
*
* 브릿지 패턴
* 추상적인 것과 구체적인 것을 분리하여 연결하는 패턴
* -> 하나의 계층구조일 때보다 각기 나누었을 때 독립적인 계층 구조로 발전시킬 수 있다.
*
* Client -> Abstraction(추상적인 로직) -> Implementation(구체적인 상태)
*
* 장점
* -> 추상적 코드를 구체적 코드 변경 없이 독립적으로 확장 가능
* -> 추상적인 코드와 구체적 코드를 부닐 가능
*
* 단점
* -> 계층 구조 늘어남으로 인한 복잡도 증가
*
* */


import com.example.design_pattern.structural.bridge_pattern.after.Akali;
import com.example.design_pattern.structural.bridge_pattern.after.KDA;
import com.example.design_pattern.structural.bridge_pattern.before.Champion;
import com.example.design_pattern.structural.bridge_pattern.before.KDA_Ahri;

public class Bridge_App {
    public static void main(String[] args) {
        // 불필요한 중복 발생, 확장성 저하
        Champion ahri = new KDA_Ahri();
        ahri.move();

        //
        Champion akali = new Akali(new KDA());
        akali.move();
    }
}

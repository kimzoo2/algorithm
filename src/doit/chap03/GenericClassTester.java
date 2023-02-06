package src.doit.chap03;

import javax.print.DocFlavor;

public class GenericClassTester {

    static class GenericClass<T> {
        private T xyz;
        GenericClass(T t){
            this.xyz = t;
        }

        T getXyz() {
            return xyz;
        }
    }

    public static void main(String[] args) {
        //다음과 같이 매개변수에 String을 넘길 수도 있고 Integer를 넘길 수도 있음
        GenericClass<String> s = new GenericClass<String>("ABC");
        GenericClass<Integer> n = new GenericClass<Integer>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());
    }
}

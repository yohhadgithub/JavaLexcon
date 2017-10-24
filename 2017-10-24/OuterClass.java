package chapter3;

import bengt.Str;

public class OuterClass {
    class InnerClass1{
        String nameInner;
        void setNameInner(String s){ nameInner = s;}
        String getNameInner() { return nameInner; }
    }

    void useInnerClass1(){
        InnerClass1 innerClass1 = new InnerClass1();
        innerClass1.setNameInner("Innerclass 1 Name");
        System.out.println(innerClass1.getNameInner());

    //    InnerClass2 innerClass2 = new InnerClass2();

    }
    void useInnerClass2(){
        class InnerClass2{
            String nameInner;
            void setNameInner(String s){ nameInner = s;}
            String getNameInner() { return nameInner; }
        }

        InnerClass2 innerClass2 = new InnerClass2();
        innerClass2.setNameInner("Innerclass 2 Name");
        System.out.println(innerClass2.getNameInner());
    }


}


class TestOuterClass{

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.useInnerClass1();

        outerClass.useInnerClass2();
    }

}

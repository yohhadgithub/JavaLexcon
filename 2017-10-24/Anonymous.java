package chapter3;


/**
 * Created by Solidbeans on 2017-01-15.
 */
interface InterFace{  void print();  }
interface InterFace2{  void print(String x);  }
public class Anonymous {
    public static void main (String[] args){
        InterFace iF = new InterFace(){
            public void print(){ System.out.println("Print Anonymous "); }

        };
        iF.print();

        new InterFace(){
            public void print(){ System.out.println("Print Anonymous B"); }
        }.print();


        InterFace2 iF2 = new InterFace2(){
            public void print(String s){ System.out.println("Print Anonymous 2 " + s); }

        };
        iF2.print("Hej");

        new InterFace2(){
            public void print(String s){ System.out.println(s); }
        }.print("Hejsan");
    }
}

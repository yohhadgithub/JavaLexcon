package chapter3;


interface InterFaceLambda{  void print();  }
interface InterFaceLambda2{  void print(String x);  }
public class Lambda {

    public static void main(String[] args) {
        InterFace iFL = () -> System.out.println("Print Lambda");
        iFL.print();

        InterFace2 iFL2 = (a) -> System.out.println("Print Lambda " + a);
        iFL2.print("Hej");

    }
    


}

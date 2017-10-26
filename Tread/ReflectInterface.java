package chapter4;

public class ReflectInterface {

    public static void main(String[] args) {
        ReflectInterface reflectInterface = new ReflectInterface();
        reflectInterface.MyTest("MyClass1","MyString 1");
        reflectInterface.MyTest("MyClass2","MyString 2");
        reflectInterface.MyTest("MyClass3","MyString 3");
    }
    public void MyTest(String classname,String value){
        String packageName = getClass().getPackage().getName();
        String myClass = packageName + "." + classname;
        try {
            MyInterface myInterface = (MyInterface) Class.forName(myClass).newInstance();
            myInterface.myMethod(value);



        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}


interface MyInterface {
    void myMethod(String string);
}

class MyClass1 implements MyInterface {
    @Override
    public void myMethod(String string) {
        System.out.println(string.toUpperCase());
    }
}

class MyClass2 implements MyInterface {
    @Override
    public void myMethod(String string) {
        System.out.println(string.toLowerCase());
    }
}
class MyClass3 implements MyInterface {
    @Override
    public void myMethod(String string) {
        System.out.println(string.toUpperCase() + " " + string.toLowerCase()
        );
    }
}
package chapter4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * Created by Solidbeans on 2017-01-17.
 */
public class Reflect {


    public static void main(String[] args) {

        String[] myClasses = {"ClassA","ClassB","ClassC"};
        try {

            for (int i =0; i<myClasses.length;i++) {
                System.out.println("Class -  " +  myClasses[i]);

                Class classEx = Class.forName("chapter4." +myClasses[i]);
                ClassBase myClassEx = (ClassBase) classEx.newInstance();

                ClassBase myClass = (ClassBase) Class.forName("chapter4." +myClasses[i]).newInstance();



                Method method = myClass.getClass().getMethod("myMethod");
                method.invoke(myClass);

                Method[] methodArray = myClass.getClass().getMethods();
                for(Method m: methodArray ){
                    System.out.println("Method; " +  m.getName());

                }
                System.out.println("Methods; " + myClass.getClass().getMethods().length);

                Field[] fieldArray = myClass.getClass().getFields();
                for(Field f: fieldArray ){

                    System.out.println("Field; " +  f.getName() + " " +  f.getType());
                }
                System.out.println("...");
            }

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}

class ClassBase{
    public int id;
    public String str;
    public void myMethod() {
        System.out.println("In myMethod " + this.getClass().getName());
    }
}
class ClassA extends ClassBase {

}
class ClassB extends ClassBase {
    public String str2;
}
class ClassC extends ClassBase {
    @Override
    public void myMethod() {
        System.out.println("In myMethod Override " + this.getClass().getName());
    }
}

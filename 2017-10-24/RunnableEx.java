package chapter3;

/**
 * Created by Solidbeans on 2017-01-17.
 */
public class RunnableEx {
    class Inner1 implements Runnable{
        String s;
        Inner1(){s = "Inner1"; }
        String getS(){return s;}
        @Override
        public void run() {
            System.out.println(getS());
        }
    }
    class Inner1A extends Inner1{
        Inner1A(){s = "Inner1A"; }
    }
    class Inner1B extends Inner1{
        Inner1B(){s = "Inner1B"; }
    }
    void runThreads(){
        Thread t1 = new Thread(new Inner1());
        t1.start();
        Thread t1A = new Thread(new Inner1A());
        t1A.start();
        Thread t1B = new Thread(new Inner1B());
        t1B.start();
    }
    public static void main(String args[]){


        RunnableEx runnableEx = new RunnableEx();
        runnableEx.runThreads();


        class Inner2 implements Runnable{
            String s = "inner2";
            @Override
            public void run() {
                System.out.println(s);
            }
        }
        Inner2 i2 = new Inner2();
        Thread t2 = new Thread(i2);
        t2.start();


    }


}

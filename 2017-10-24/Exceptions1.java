package chapter3;


import java.io.*;

import java.lang.reflect.Array;

/**
 * Created by Solidbeans on 2017-01-16.
 */
public class Exceptions1 {

    public static void main(String Args[]) {
        //    uncheckedException();
        //     checkedException();

        try {
            checkedException2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void uncheckedException(){
        int[] array = new int[3];
        int max = 3;
        try{
            for(int i=0; i<=max ;++i){
                array[i] = i;
            }
     //    array[0] = 2/0;

            System.out.println("Seems to be ok!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Oops, we went to far, better go back to 0!");
            try {
                throw new Exception();
            } catch (Exception e1) {
                System.err.println(e.getMessage());
            }
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide by Zero!");
            //method call to continue program
        }
        catch(RuntimeException e){}
        finally{
            System.out.println("Finally Done");
        }

    }

    public static void checkedException(){


        try {
            FileReader file = new FileReader("xa.txt");

            BufferedReader fileInput = new BufferedReader(file);

            // Print first 3 lines of file "C:\test\a.txt"
            for (int counter = 0; counter < 3; counter++)
                System.out.println(fileInput.readLine());

            fileInput.close();


        } catch (FileNotFoundException e) {

            System.err.println("Oops " + e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public static void checkedException2() throws IOException {

        FileReader file = new FileReader("xa.txt");

        BufferedReader fileInput = new BufferedReader(file);

        // Print first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());

        fileInput.close();

    }

}

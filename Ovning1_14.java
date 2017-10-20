public class Ovning1_14 {
	public static void main(String[] args) {
		 String personnummer= args[0];
         int num = personnummer.charAt(11);

        if(num % 2 == 0)
            System.out.println("Män");
        else
            System.out.println("Kvinna");
    }
}

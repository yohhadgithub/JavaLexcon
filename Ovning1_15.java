public class Ovning1_15 {
	public static void main(String[] args) {
		try {
            String inputNum = args[0];
            int num = inputNum.length();
            for(int i= num -1 ; i >= 0; i--)
                System.out.print(inputNum.charAt(i));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

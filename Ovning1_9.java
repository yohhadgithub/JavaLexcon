public class Ovning1_9 {
     public static void main(String[] args) {

        String val = args[0];
        switch (val) {
            case "v":
                System.out.println(" Version 1");
                break;
            case "V":
                System.out.println(" Version 1");
                break;
            default:
                System.out.println(" Pleas Enter V or v");
        }
    }
}


public class ExampleArg {
    public static void main(String[] args) {
		if(args.length == 0)
			System.out.println("You pass null args");
		else
			System.out.println("You Pass " + args.length + " argument");
		
	}
}
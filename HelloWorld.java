

public class HelloWorld {
    public static void main(String[] args) {
		if ( args.length < 1)
			System.out.println("You forger to give an argumenrt ");
		else
			System.out.println("Hello " + args[0]);
	}
}
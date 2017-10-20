import java.io.Console;

public class Ovning1_10 {
	public static void main(String[] args) {
        String input;
        System.out.println("Avslutas skriva Q eller q!");
        do {
            Console console = System.console();
            input = console.readLine("Enter input:");
        } while(!input.toUpperCase().equals("Q") );
    }
}

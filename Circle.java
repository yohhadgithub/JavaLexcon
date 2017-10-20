
public class Circle {
	public static void main(String[] args) {
		try{
            int val = Integer.parseInt(args[0]);
			double area = 3.141593*val*val;
			double omkrets =3.141593*(2*(val));
		
			System.out.println("Cirkelns area: " + area);
			System.out.println("Cirkelns omkrets: " + omkrets);
       }
       catch(NumberFormatException e){
		   System.out.println("Snälla anger rätt nummer!");

       }
      
    }
}

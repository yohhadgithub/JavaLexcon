public class Triangle {

    public static void main(String[] args) {
        int min_stars = 1;
        int p_height = 6;
        int p_space = p_height - 1;
        int i,j,k;
        for(i=0; i<p_height; i++){
            for(j=p_space;j>i; j--){
                System.out.print(" ");
            }
            for (k=0; k < min_stars; k++){
                System.out.print("*");
            }
            min_stars +=2;
            System.out.println();
        }
    }
}


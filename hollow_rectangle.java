/**
 * hollow_rectangle
 */
public class hollow_rectangle {

    public static void main(String[] args) {
        
        int a = 4; // row
        int b = 5; // column

        for (int i=1; i<=a; i++){

            for ( int j=1; j<=b; j++){
                
                if( i == 1 || i == 4 || j == 1 || j == 5 ){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
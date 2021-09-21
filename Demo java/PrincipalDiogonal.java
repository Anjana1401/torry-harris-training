import java.util.Scanner;

public class PrincipalDiogonal {
    public static void main(String[] args) {

        int [][]matrix = new int[3][3];
        System.out.println("enter for 3*3 matrix");
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[0].length; k++) {
                matrix[i][k] = scan.nextInt();
            }
        }
        System.out.println("principal elements are");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println( matrix[i][i]);
        }

        System.out.println("\n secondary elements are");
        for (int i=0,j=2;i<matrix.length;i++,j--){
                System.out.println(matrix[i][j]);
        }
    }
}



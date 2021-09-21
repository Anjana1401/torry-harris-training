import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        int [][]matrix = new int[3][3];
        System.out.println("enter for 3*3 matrix");
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[0].length; k++) {
                matrix[i][k] = scan.nextInt();
            }
        }
        System.out.println("matrix elements are");
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k <matrix[0].length; k++) {

                System.out.print(matrix[i][k]+ " ");
            }
            System.out.println();
        }

    }
}

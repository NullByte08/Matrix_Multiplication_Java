import java.util.Scanner;
public class MatrixMulti {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] n = new int[2][2];
        for (int i = 0; i < 2; i++) {
            String[] a = new String[]{"first", "second"};
            String[] b = new String[]{"rows", "columns"};
            for (int j = 0; j < 2; j++) {
                System.out.println("Enter the number of " + b[j] + " in the " + a[i] + " matrix: ");
                n[i][j] = scan.nextInt();
            }
        }
        if(n[0][1] == n[1][0]) {
            int[][]a=new int[n[0][0]][n[0][1]];
            int[][]b=new int[n[1][0]][n[1][1]];
            int[][]c=new int[n[0][0]][n[1][1]];
            
            System.out.println("Enter the first matrix row wise : ");
            for(int i=0;i<n[0][0];i++) {
                for(int j=0;j<n[0][1];j++) {
                    a[i][j]=scan.nextInt();
                }
            }
            
            System.out.println("Enter the second matrix row wise : ");
            for(int i=0;i<n[1][0];i++) {
                for(int j=0;j<n[1][1];j++) {
                    b[i][j]=scan.nextInt();
                }
            }
            
            for(int i=0;i<n[0][0];i++){
                for(int j=0;j<n[1][1];j++) {
                    for(int k=0;k<n[0][1];k++) {
                        c[i][j]=c[i][j]+a[i][k]*b[k][j];
                    }
                }
            }
            
            System.out.println("The product matrix is : ");

            for(int i=0;i<n[0][0];i++) {
                for(int j=0;j<n[1][1];j++) {
                    System.out.print(c[i][j]+" ");
                }
                
                System.out.println();
            }
            
        } else {
            System.out.println("Multiplication not possible");
        }

    }

}

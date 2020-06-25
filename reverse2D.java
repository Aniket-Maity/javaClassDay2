import java.util.Scanner;
public class reverse2D{
    public static void main(String[] args){
        if(args.length!=4){
            System.out.println("Please enter 4 integer numbers");
            return;
        }
        int[][] myArr = new int[2][2];
        System.out.print("The given array is :\n");
        int k=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                myArr[i][j] = Integer.parseInt(args[k]);
                k++;
            }
                
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(myArr[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\nThe reverse of the array is :\n");
        for(int i=1;i>=0;i--){
            for(int j=1;j>=0;j--){
                System.out.print(myArr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
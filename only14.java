import java.util.Scanner;
public class only14{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the length of array: ");
        int length = s.nextInt();
        int[] myArr = new int[length];
        System.out.println("enter element of array: ");
        for(int i=0;i<length;i++){
            myArr[i] = s.nextInt();
        }
        int[] modifiedArr = new int[length];
        boolean flag = true;
        for(int i=0;i<length;i++){
            if(myArr[i]!=1 && myArr[i]!=4){
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
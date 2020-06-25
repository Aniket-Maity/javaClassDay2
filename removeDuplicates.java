import java.util.Scanner;
public class removeDuplicates{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the length of array: ");
        int length = s.nextInt();
        int[] myArr = new int[length];
        System.out.println("enter element of array: ");
        for(int i=0;i<length;i++){
            myArr[i] = s.nextInt();
        }
        boolean flag;

        for(int i=0;i<myArr.length;i++){
            flag = true;
            for(int j=0;j<myArr.length;j++){
                // System.out.println(myArr[i]+": "+myArr[j]);
                // System.out.println(myArr[j]);
                if(myArr[i]==myArr[j] && i!=j){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(myArr[i] +"\t");
            }
        }
    }
}
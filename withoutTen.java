import java.util.Scanner;

public class withoutTen{
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
        int j=0;
        int count = 0;
        for(int i=0;i<length;i++){
            if(myArr[i]!=10){
                modifiedArr[j] = myArr[i];
                j++;
            }
            else{
                count++;
            }
        }
        if(count!=0){
            while(count!=0){
                modifiedArr[j] = 0;
                j++;
                count--;
            }
        }
        for(int i=0;i<length;i++){
            System.out.print(modifiedArr[i]+"\t");
        }

    }
}
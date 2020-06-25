import java.util.Scanner;
public class middleWay{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] firstArr = new int [3];
        int[] secondArr = new int [3];
        int[] modifiedArr = new int [2];
        System.out.println("element of first array: ");
        for(int i=0;i<3;i++){
            firstArr[i] = s.nextInt();
        }
        System.out.println("element of second array: ");
        for(int i=0;i<3;i++){
            secondArr[i] = s.nextInt();
        }
        modifiedArr[0] = firstArr[1];
        modifiedArr[1] = secondArr[1];
        for(int element : modifiedArr){
            System.out.print(element+"\t");
        }

    }
}
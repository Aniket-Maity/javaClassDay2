public class sumAndAvg{
    public static void main(String[] args){
        int[] myArr = {1,2,3,4,5};
        int sum = 0;
        for(int element : myArr){
            sum+=element;
        }
        System.out.println("sum: "+sum);
        System.out.println("avg: "+sum/myArr.length);

    }
}
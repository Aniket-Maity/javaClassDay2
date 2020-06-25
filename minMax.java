public class minMax{
    public static void main(String[] args){
        int[] myArr = {53,2,56,7,89,32};
        int min = myArr[0];
        int max = myArr[0];
        for(int element : myArr){
            if(min>=element){
                min = element;
            }
        }
        for(int element : myArr){
            if(max<=element){
                max = element;
            }
        }
        System.out.println("min: "+ min);
        System.out.println("max: "+ max);
    }
}
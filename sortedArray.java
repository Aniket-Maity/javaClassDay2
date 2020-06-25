public class sortedArray{
    public static void main(String[] args){
        int[] myArr = {45,1,4,34,56,7};
        int temp;
        for(int i=0;i<myArr.length;i++){
            for(int j=0;j<myArr.length-i-1;j++){
                if(myArr[j]>=myArr[j+1]){
                    temp = myArr[j];
                    myArr[j] = myArr[j+1];
                    myArr[j+1] = temp;
                }
            }
        }
        for(int element : myArr){
            System.out.println(element);
        }
    }
}
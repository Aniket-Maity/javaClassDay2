public class findNum{
    public static void main(String[] args){
        int[] myArr = {1,4,34,56,7};
        int inputNum = Integer.parseInt(args[0]);
        int pos = -1;
        for(int i=0;i<myArr.length;i++){
            if(inputNum == myArr[i]){
                pos = i;
                break;
            }
        }
        System.out.println(pos);
    }
}
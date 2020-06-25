public class succeedingOrder{
    public static void main(String[] args){
        // int[] myArr = {10,3,6,1,2,7,9};
        // int[] myArr = {7,1,2,3,6};
        int[] myArr = {1,6,4,7,9};
        int posSix = -1;
        int posSeven = -1;
        boolean flag = false;
        for(int i=0;i<myArr.length;i++){
            if(myArr[i]==6){
                posSix = i;
            }
            else if(myArr[i]==7){
                posSeven = i;
            }
        }
        if(posSeven>posSix)
            flag = true;
        int sum = 0;
        if(flag){
            for(int i=0;i<myArr.length;i++){
                if(posSix<=i && i<=posSeven){
                    sum+=0;
                }
                else
                    sum+=myArr[i];
            }
        }
        else{
            for(int i=0;i<myArr.length;i++){
                sum+=myArr[i];
            }
        }
        System.out.println(sum);
        
        

    }
}
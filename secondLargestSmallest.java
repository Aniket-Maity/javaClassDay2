public class secondLargestSmallest{
    public static void main(String[] args){
        int[] myarr = {45,1,4,34,56,7};
        int min = myarr[0];
        int max = myarr[0];
        for(int element : myarr){
            if(min>=element){
                min = element;
            }
        }
        for(int element : myarr){
            if(max<=element){
                max = element;
            }
        }
        int secondMin = myarr[0];
        int secondMax = myarr[0];
        for(int element : myarr){
            if(secondMin>=element && element!=min){
                System.out.println(element);
                secondMin = element;
            }
        }
        for(int element : myarr){
            if(secondMax<=element && element!=max){
                secondMax = element;
            }
        }
        System.out.println("lergest 2 number: "+max+", "+secondMax);
        System.out.println("smallest 2 number: "+min+", "+secondMin);
    }
}
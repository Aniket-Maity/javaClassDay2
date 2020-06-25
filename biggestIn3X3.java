public class biggestIn3X3{
    public static void main(String[] args){
        if(args.length!=9){
            System.out.println("Please enter 9 integer numbers");
            return;
        }
        int[][] myArr = new int[3][3];
        int k=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                myArr[i][j] = Integer.parseInt(args[k]);
                k++;
            }
        }
        // System.out.println("myArr: ");
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(myArr[i][j]);
        //     }
        //     System.out.print("\n");
        // }
        int max = myArr[0][0];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(max<myArr[i][j]){
                    max = myArr[i][j];
                }
            }
        }
        // System.out.println("myArr max: "+max);
        System.out.println(max);
    }
}
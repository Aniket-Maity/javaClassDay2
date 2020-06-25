public class asciiToChar{
    public static void main(String[] args){
        int[] myAsciiArr = {97,100,102,78,89,95};
        for(int element : myAsciiArr){
            System.out.print((char)element);
        }
    }
}
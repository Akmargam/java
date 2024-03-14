public class MaxMin {
    public static void main(String[]args){
        int[] numArray={12,3,134,435,1,43755,7867,4};
        int max=numArray[0];
        int min=numArray[0];
        for(int i=1;i<numArray.length;i++){
            if(max<numArray[i]){
                max=numArray[i];
            }
            if(min>numArray[i]){
                min=numArray[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

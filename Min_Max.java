public class Min_Max{
    public static int min(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            if(min>array[i])
                min = array[i]; 
        }                   //0 - 6 -min
                            //1 - 5
        return min;         //2 - 2
    }                       //3 - 2 - min
                            //4 - 2 - min
    public static int max(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
           if(max<array[i])
            max = array[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] array = {6,5,2,8,3};
        System.out.println(max(array));
    }

}
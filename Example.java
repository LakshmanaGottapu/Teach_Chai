public class Example{
    public static boolean method(int[] array){
        int l = array.length;
        boolean flag = false;           //{3, 4, 5, 1, 6, 10, 9, 7, 8}
        boolean f = true;              //{f  f, f, f, t                f}
        if(l == 0 || l==1 || l==2)
            return false;
        for(int i=1; i<l-1; i++){
            for(int j=0; j<i; j++){
                if(array[j]>=array[i]){
                    f = false;
                    break;
                }      
            }
            if(f){
                for(int k=i+1; k<l; k++){
                    if(array[k]<=array[i]){
                        f = false;
                        break;
                    }   
                }
            }
           
            if(f) {
                flag = true;
                break;
            }
            f = true;
        }
        return flag;
    }
    public static void main(String[] args) {
        int array[] = {4,5,6};
        //{3, 4, 5, 1, 3, 10, 9, 7, 8};
        System.out.println(method(array));
    }
}
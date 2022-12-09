public class Arrays {
    public static boolean arr(int[] arr1, int[] arr2){
        int counter1=0;
        int counter2=0;        
        
        for(int i=0;i<arr1.length;i++){
            if(String.valueOf(arr1[i]).length()==2){
                counter1+=1;
            }
        }

        for(int i=0;i<arr2.length;i++){
            if(String.valueOf(arr2[i]).length()==2){
                counter2+=1;
            }
        }

        return counter1==counter2;
    }


    public static void main(String args[]){
        System.out.println(arr(new int[]{15,8,2,37,49,117},new int[]{9,6,7,12,48,4,6,90,5}));
    }
}

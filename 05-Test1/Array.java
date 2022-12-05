import java.util.ArrayList;

import java.util.stream.*;

public class Array {
    public static int odd(int[] array){
        
        int n = array.length;
        
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i=0;i<n-1;i++){
            if(array[i]%2==0&&array[i]>0){
                result.add(array[i]);
            } 
        }

        return result.size();

    }


    public static int above(int[] array){
        int mean = IntStream.of(array).sum()/array.length;

        int sum = 0;

        for(int value:array){
            if(value>mean){
                sum = sum + value;
            }
        }

        return sum;
    }

    public static void main(String args[]){
        System.out.println(odd(new int[] {3,2,-5,4,1,-7}));
        System.out.println(above(new int[] {5,2,7,4,2}));
    }
}

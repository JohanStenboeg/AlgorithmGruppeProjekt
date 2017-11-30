package AlgorithmsSorting;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.ArrayList;

public class SortingAlgorithms {
    public static void main(String[] args) {
        System.out.println("Sup");
        Boolean lost = false;
        int[] numbersfrom = {9,8,7,6,5,4,1,2,3};
        int[] numbersinto = numbersfrom;
        int x = 0;
        //ArrayList<Integer> numbersInto = new ArrayList<Integer>();
/*m
        while(lost== false){
            if(numbersfrom[(x+1)] > numbersfrom[x]){
                numbersInto.add(numbersfrom[x]);

            }
            System.out.println(numbersInto);

            x++;
            if(x==10){
                lost=true;
            }
        }*/

        for (int i = 0; i < numbersfrom.length; i++) {
            //System.out.println(numbersfrom[i]);
            System.out.println(numbersinto[i]);
            if(numbersfrom[i]<numbersfrom[(i+1)]){
                int temp=numbersfrom[(i+1)];
                int temp2=numbersfrom[i];
                numbersinto[i] =temp;
                numbersinto[(i+1)]=temp2;
            }
        }
/*
        for (int i = numbersfrom.length; i < 10; i--) {


        }
*/
    }

}

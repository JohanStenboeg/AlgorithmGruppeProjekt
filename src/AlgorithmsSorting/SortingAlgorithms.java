package AlgorithmsSorting;


public class SortingAlgorithms {
    static public void bubble(int[] arr){
        int laengde = arr.length;
        int temp = 0;

        for(int i=0; i < laengde; i++){
            for(int k=1; k < (laengde-1); k++) {
                if(arr[k-1] > arr[k]){

                    //Bytter rundt på lister.
                    temp = arr[k-1];
                    arr[k-1] = arr[k];
                    arr[k] = temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,7,6,1,3,5,9,8,0};
        System.out.println("Bubble sort list: ");
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();

        bubble(arr);

        System.out.println("Efter sortering: ");
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }




    }


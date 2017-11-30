import java.util.Scanner;

public class BenjaminAlgorithm {

    public static void main(String[] args) {
        // write your code here
        final String[] LinearSearch;
        final int count;
        Scanner input = new Scanner(System.in);

        LinearSearch = new String[5];

        LinearSearch[0] = "Benjamin";
        LinearSearch[1] = "Mikkel";
        LinearSearch[2] = "Mads";
        LinearSearch[3] = "Johan";
        LinearSearch[4] = "Mathias";

        String navn = null;

        System.out.print("Indtast navn: ");
        navn = input.next();
        for (int i = 0; i < LinearSearch.length; i++) {

            if (LinearSearch[i].equals(navn)) {
                System.out.println(navn + " er i skole i dag.");

                break;
            }
            else{
                System.out.println(navn + " er ikke i skole i dag.");
            }
        }
    }
}
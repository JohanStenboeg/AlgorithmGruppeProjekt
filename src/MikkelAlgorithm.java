public class MikkelAlgorithm {
    public static void main(String[] args) {

        String nameSearch = "András";       // String, hvor man skriver navnet du leder efter
        String[] navne = {"Johan", "Mads", "Mathias", "Benjamin", "András", "Mikkel"};  //Alle navne i arrayet
        int i;

        for (i = 0; i < navne.length; i++) {        //for loop, hvor loopet vil gå op til arrayets længde,
            // hvis loopet ikke finder navnet, i++
            if (nameSearch == navne[i]){
                System.out.println("Navn fundet på position " + i);     //hvis navnet bliver fundet, annonceres det i console
                break;  // Stoppet loopet, hvis navnet er fundet
            }
            else{
                System.out.println("Navn er ikke fundet på positionen");        //Hvis navnet ikke er fundet, annonceres det også i console
            }

        }


    }
}
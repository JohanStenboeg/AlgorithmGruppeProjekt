public class TheCaptain420BlazeItSearch {

    public static void main(String[] args) {
        Boolean found = false;
        String[] navn= {"Mathias", "Jens", "Søren", "Benjamin", "Mikkel", "Johan", "Mads" };
        int i = 0;

        String nameyourelookingfor = "kren";

        while (found == false){

            if( nameyourelookingfor == navn[i] ){
                System.out.println("You found him at pos: " + i);
                break;
            } else{
                System.out.println("You didnt find him here: "+ i);
            }



            i++;
            if(i>(navn.length)){
                System.out.println("Looks like we didnt find him!");

            }

        }



    }

}

public class TurmDemo {
    public static void main(String[] args) {

        int zahl = 9;
        int multiplikator = 2;

        while(multiplikator <= 9){
            System.out.println(zahl + " * " + multiplikator + " = " + zahl * multiplikator);
            zahl = zahl * multiplikator;
            if(multiplikator == 9){break;}
            multiplikator++;
        }

        //fixing "bug" multiplikator gets incremented to 10
        //multiplikator--;

        while(multiplikator >= 2){
            System.out.println(zahl + " / " + multiplikator + " = " + zahl / multiplikator);
            zahl = zahl/multiplikator;
            multiplikator--;
        }


    }
}

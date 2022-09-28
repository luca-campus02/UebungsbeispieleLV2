public class WinterreifenpflichtDemo {
    public static void main(String[] args) {

        int temperatur = 10;
        boolean rutschigeFahrbahn = true;
        boolean winterreifenPflicht = isWinterreifenPflicht(temperatur,rutschigeFahrbahn);

        if(winterreifenPflicht){
            System.out.println("Bitte Winterreifen verwenden!");
        }
        else{
            System.out.println("Winterreifen sind nicht erforderlich!");
        }

    }

    public static boolean isWinterreifenPflicht (int temperatur, boolean rutschigeFahrbahn){

        boolean winterreifenPflicht;

        if(temperatur < 10 && rutschigeFahrbahn){
            winterreifenPflicht = true;
        }
        else if (temperatur < 4) {
            winterreifenPflicht = true;
        }
        else{
            winterreifenPflicht = false;
        }

        return winterreifenPflicht;
    }
}

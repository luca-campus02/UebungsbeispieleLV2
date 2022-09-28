public class NotenDemo {
    public static void main(String[] args) {

        System.out.println(calcGrade(90));
        System.out.println(calcGrade(13));
        System.out.println(calcGrade(51));
        System.out.println(calcGrade(78));
        System.out.println(calcGrade(77));

    }

    public static String calcGrade(int points){

        String grade;

        if(points >= 90){
            grade = "Sehr Gut";
        }
        else if (points >=78) {
            grade = "Gut";
        }
        else if (points >=65) {
            grade = "Befriedigend";
        }
        else if (points >=51) {
            grade = "Genügend";
        }
        else if (points <= 50) {
            grade = "Nicht Genügend";
        }
        else{
            grade = "NO GRADE";
            System.out.println("Note konnte nicht berechnet werden. Bitte angegebenen Wert: "+points+" überprüfen.");
        }

        return grade;
    }
}

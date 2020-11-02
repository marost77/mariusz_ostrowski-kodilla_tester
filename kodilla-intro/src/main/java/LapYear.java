public class LapYear {
    public static void main(String[] args) {
        int year = 2016;
        double yearModulo4 = year%4;
        double yearModulo100 = year%100;
        double yearModulo400 = year%400;
        if(yearModulo4==0 && yearModulo100>0) {
            System.out.println(year);
            System.out.println("To rok przestępny"); }
        else if(yearModulo400==0){
            System.out.println(year);
            System.out.println("To rok przestępny");}
        else {
            System.out.println(year);
            System.out.println("To NIE jest rok przestępny"); }
    }
}

public class SimpleArray {
    public static void main(String[] args) {
        String[] cooworkers = new String[]{"Daniel", "Piotr", "Krzysztof", "Patryk", "Anna"};
        String cooworker3 = cooworkers[3];
        System.out.println(cooworker3);
        int numberOfElements = cooworkers.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");
    }
}
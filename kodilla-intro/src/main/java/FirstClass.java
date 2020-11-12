public class FirstClass {                           // [1]
    public static void main(String[] args) {         // [2]
        System.out.println("Hello from FirstClass!"); // [3]

            Notebook notebook = new Notebook("600g",1000,2020);
            System.out.println("modern: weight " + notebook.weight + ", price " + notebook.price + " EUR,"+" year "+notebook.year);
            notebook.checkPrice();
            notebook.checkWeight();
            notebook.recommendLaptop();
                System.out.println();

            Notebook heavyNotebook = new Notebook("2000g",550,2019);
            System.out.println("heavy: weight " + heavyNotebook.weight + ", price " + heavyNotebook.price +" EUR,"+" year "+heavyNotebook.year);
            heavyNotebook.checkPrice();
            heavyNotebook.checkWeight();
            heavyNotebook.recommendLaptop();
                System.out.println();


            Notebook oldNotebook = new Notebook("1200g", 400,2017);
            System.out.println("old: weight " + oldNotebook.weight + ", price " + oldNotebook.price+ " EUR,"+" year "+oldNotebook.year);
            oldNotebook.checkPrice();
            oldNotebook.checkWeight();
            oldNotebook.recommendLaptop();
                System.out.println();


    }
}
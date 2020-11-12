public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        int weight2 = replaceString(weight);
        if (weight2 <= 750) {
            System.out.println("This laptop in light weight ");
        } else if (weight2 > 750 && weight2 < 1800) {
            System.out.println("This laptop in medium weight ");
        } else {
            System.out.println("This laptop in heavy weight ");
        }
    }

    public void recommendLaptop () {
        int weight2 = replaceString(weight);
        if (weight2 <1000 && this.year > 2019){
            System.out.println("Recommended for bussiness ");
        }
        else if (this.year >=2019 && this.price <2000){
            System.out.println("Recommended for general use ");
        }
        else {
            System.out.println("Not recommended");
        }
    }

    private int replaceString (String weight) {

        String stringTemp = weight.replace("g","").replace("G","");
        return Integer.valueOf(stringTemp);

    }
}
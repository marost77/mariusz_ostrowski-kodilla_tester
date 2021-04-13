import java.util.Arrays;

public class Random2 {
    int max;
    int min;
    int limit;


    public Random2(int max, int min, int limit) {
        this.max = max;
        this.min = min;
        this.limit = limit;

    }

    public int[] losuj() {
        int size = 5000;
        int[] list = new int[size];// jak zmieniać dynamicznie wielkość tablicy ?
        int sum = 0;
        for (int i = 0; sum < this.limit ; i++) {
            list[i]=(int) (Math.random() * (this.max - this.min +1) + this.min);
            sum=sum+list[i];
        }
        return list;
    }

    public void showList (){
       System.out.println(Arrays.toString(losuj()));

    }


    public void showMax (){
        int maxValue = losuj()[0];
        for (int i = 0; i < losuj().length; i++) {
            if (losuj()[i] > maxValue) {
                maxValue = losuj()[i];
            }
        }
        System.out.println(maxValue);
    }

    public void showMin (){
        int minValue = losuj()[0];
        for (int i = 0; i < losuj().length; i++) {
            if (losuj()[i] < minValue) {
                minValue = losuj()[i];
            }
        }
        System.out.println(minValue);
    }


    public static void main(String[] args) {

        Random2 r = new Random2(30,0,5000);
        r.losuj();
        r.showList();
        r.showMax();
        r.showMin();

    }

}
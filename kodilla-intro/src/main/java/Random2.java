import java.util.Arrays;

public class Random2 {
    int max;
    int min;
    int limit;
    int[] list;

    public Random2(int min, int max, int limit) {
        this.limit = limit;
        this.max = max;
        this.min = min;



    }

    public int[] losuj() {
        int size = 100;
        int[] list = new int[size];// jak zmieniać dynamicznie wielkość tablicy ?
        int sum = 0;
        for (int i = 0; sum < limit ; i++) {

            list[i]=(int) (Math.random() * (max - min +1) + min);

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
        System.out.println(losuj()[0]);
        }





    public static void main(String[] args) {

        Random2 r = new Random2(1,5,10);
        r.losuj();
        r.showList();
        r.showMax();

    }

}
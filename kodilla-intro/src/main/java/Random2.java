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
        int[] list = new int[1000];// jak zmieniać wielkość tablicy ?
        int sum = 0;
        for (int i = 0; sum < limit; i++) {
            list[i] = (int) (Math.random() * (max - min + 1) + min);
            sum = sum + list[i];

        }
        return list;
    }

    public void showList (){
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

    }

    public static void main(String[] args) {

        Random2 r = new Random2(1,5,20);
        r.losuj();
        r.showList();

    }

}
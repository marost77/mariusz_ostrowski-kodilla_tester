public class RandomNumbers {
    int random; //losowa liczba
    int max;
    int min;
    int limit;
    int[] list;

    public RandomNumbers(int min, int max, int limit) {
        this.max = max;

        this.min = min;
        this.limit = limit;

    }

            public void draw() {


                int sum = 0;
                //int size = 1;
                int list[]=new int[1000];//jak powiększać rozmiar tablicy ?

                for (int i = 0; sum < limit ; i++) {
                   list[i]=(int) (Math.random() * (max - min + 1) + min);
                    System.out.println(list[i]);
                    sum=sum+list[i];
                    //size++;

                }

            }

}




public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;

    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;

        this.size++;
    }

    public void showLast() {

        System.out.println("Last grade: "+this.grades[this.size-1]);

    }

    public void average() {
        double sum = 0;
        double average;

            for (int i = 0; i < grades.length; i++) {
            sum = sum + this.grades[i];
            }

            //System.out.println("sum: "+sum);
            //System.out.println(size);

            average = (sum / size);
            System.out.format("Average grade: %.2f",average);
    }



}

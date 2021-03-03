package fizzbuzz;

public class fizzbuzzCheck {

    public String fizzbuzzCheck (int number){
        int modulo3 = number %3;
        int modulo5 = number %5;

        if(modulo3 == 0 && modulo5 ==0) {
            return "FizzBuzz";
        }
        else if (modulo3 == 0){
            return "Fizz";
        }
        else if (modulo5 == 0){
            return "Buzz";
        }
        else return "None";

    }
}

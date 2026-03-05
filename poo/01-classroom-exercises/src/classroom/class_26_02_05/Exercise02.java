package classroom.class_26_02_05;
/*
02 - Imprima a soma de 1 até 1000.
*/
public class Exercise02 {
    static void main(String[] args){
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }

        System.out.printf("The sum that 1 to 1000 is: " + sum);
    }
}

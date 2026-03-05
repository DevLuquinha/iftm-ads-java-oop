package classroom.class_26_02_05;
/*04 - Imprima os fatoriais de 1 a 10.*/

public class Exercise04 {
    static void main() {
        for (int i = 0; i <= 10; i++) {
            System.out.printf(
                    "O fatorial de %d eh (%d!) * %d = %d\n",
                    i,
                    i,
                    i+1,
                    factorial(i)
            );
        }
    }

    static int factorial(int num){
        if (num == 0){
            return 1;
        }

        int result = num;

        for (int i = num; i >= 2; i--) {
            result = result * (i-1);
        }

        return result;
    }
}

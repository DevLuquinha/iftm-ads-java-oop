package classroom.class_26_02_05;

/*03 - Imprima todos os múltiplos de 3, entre 1 e 100*/

public class Exercise03 {
    static void main() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0){
                System.out.printf("O numero %d eh multiplo de 3\n", i);
            }
        }
    }
}

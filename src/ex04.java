public class ex04 {
    void main() {

        int soma = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        IO.println(" soma: " + soma);

    }
}

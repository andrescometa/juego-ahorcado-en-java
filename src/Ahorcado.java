import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        System.out.println("   ");

        // clase Scanner que nos permite que el ususario escriba
        Scanner scanner = new Scanner(System.in);
        // declaraciones y asignacioones
        String PalabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // arreglos
        char[] letrasAdivinadas = new char[PalabraSecreta.length()];

        // estructura de control de tipo iterativa (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            // System.out.print(letrasAdivinadas[i]);
        }

        // estructura de control : iterativa (Bucle)

        while (!palabraAdivinada && intentos < intentosMaximos) {
            // esto se usa cuando tenemos una palabra de char
            System.out.println("Palabra a adivinar:" + String.valueOf(letrasAdivinadas) + " (" + PalabraSecreta.length() + " letras)");

            System.out.println("Introduce una letra, por favor!");

            // usamos la clase scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            // estructura de control : iterativa (Bucle)

            for (int i = 0; i < PalabraSecreta.length(); i++) {
                // estructura de control condicional
                if (PalabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }

            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("Incorrecto te quedan " + (intentosMaximos - intentos) + " intentos");

            }
            if (String.valueOf(letrasAdivinadas).equals(PalabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades, has decifrado la palabra secreta!!!!!!!......" + PalabraSecreta);

            }
        }

        if (!palabraAdivinada) {
            System.out.println("Que pena te has quedado sin intentos, GAME OVER!!!!!!!!");

        }

        scanner.close();

    }
}

import java.util.Scanner;
import java.io.*;
public class letra2Binary{
    Scanner scanner;
    private final int INTENTOS_MAXIMOS = 3;
    int intentos = INTENTOS_MAXIMOS;
    private static final char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
    public static void main(String[] args) {
        ejecutarComando();
    }

    private int getLetras(){
        int numeroLetras = -1;
        System.out.println("Cuantas letras quieres ocultar?");
        try {
             numeroLetras = scanner.nextInt();
        }
        catch (Exception err) {
            System.out.println("Error: no has introducido un número correcto de letras.");
            if (--intentos >= 0) getLetras();
            else{
                System.out.println("Ya va siendo hora de ir aprendiendo a escribir un número, macho :/");
                System.exit(1);
            }
        }
        return numeroLetras;
    }
    public static void ejecutarComando(){
        try {
            Process p = Runtime.getRuntime().exec("cmd /c dir");
            p.waitFor();
            BufferedReader leerComando = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea;
            while ((linea = leerComando.readLine())  != null ){
                System.out.println(linea);
            }
        }
        catch (Exception err) {
            System.out.println(err.getMessage());
        }
        System.out.println("DONE");
    }
}



/**
 * Programa que suma 2 numeros que se pueden poner 
 * separados por un espacio
 * 
 * @author hfonseca778
 * @version 05-08-2017
 */
import java.util.Scanner;
public class suma2num
{
    // instance variables - replace the example below with your own
    public static void main(String args[])
    {
        Scanner lector=new Scanner(System.in);
        int a=lector.nextInt();
        int b=lector.nextInt();
        lector.close();
        int suma=a+b;
        System.out.println("La suma es: " + suma);
    }
}

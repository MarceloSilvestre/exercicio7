//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

import java.util.Scanner;

public class exercicio7 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("escreva o valor do lado do quadrado ");
        double lado = teclado.nextDouble();
        teclado.close();
        
        double area = lado * lado;

        double dobro = area * 2;

        System.out.println("o dobro da área do quadrado é "+ dobro);

    }   
}

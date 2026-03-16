/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana13mariela;

/**
 *
 * @author jorge
 */
public class Semana13mariela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double nota1 = 7; 
         double nota2 = 9;
         double resultado = calcularPromedio(nota1, nota2);
         System.out.println("El promedio final es: " + resultado);
        }
         public static double calcularPromedio(double nota1, double nota2) {
         double promedio = (nota1 + nota2) / 2;
         return promedio;
    }
}
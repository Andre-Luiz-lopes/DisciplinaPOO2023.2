package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do cômodo (em metros): ");
        double largura = scanner.nextDouble();

        System.out.print("Digite o comprimento do cômodo (em metros): ");
        double comprimento = scanner.nextDouble();

        // Calcula a área do cômodo em metros quadrados
        double area = largura * comprimento;

        // Calcula a potência de iluminação necessária em Watts
        double potenciaIluminacao = area * 18;

        System.out.println("A área do cômodo é: " + area + " m²");
        System.out.println("A potência de iluminação necessária é: " + potenciaIluminacao + " W");

        scanner.close();
    }
}
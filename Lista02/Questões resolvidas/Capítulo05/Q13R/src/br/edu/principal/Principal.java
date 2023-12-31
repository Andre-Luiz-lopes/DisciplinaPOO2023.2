package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			int num_cri, meses, tot_f = 0, tot_m = 0, tot_24 = 0;
			double porc_f, porc_m, porc_24;

			System.out.print("Digite o número de crianças nascidas no período: ");
			num_cri = input.nextInt();

			if (num_cri == 0) {
			    System.out.println("NENHUMA CRIANÇA DIGITADA");
			} else {
			    for (int i = 1; i <= num_cri; i++) {
			        System.out.print("Digite o sexo da " + i + "ª criança (M ou F): ");
			        String sexo = input.next();
			        System.out.print("Digite o tempo de vida (em meses) da " + i + "ª criança: ");
			        meses = input.nextInt();

			        if (sexo.equalsIgnoreCase("M")) {
			            tot_m++;
			        } else if (sexo.equalsIgnoreCase("F")) {
			            tot_f++;
			        }

			        if (meses <= 24) {
			            tot_24++;
			        }
			    }

			    porc_f = (double) tot_f * 100 / num_cri;
			    porc_m = (double) tot_m * 100 / num_cri;
			    porc_24 = (double) tot_24 * 100 / num_cri;

			    System.out.println("Percentual de crianças do sexo feminino mortas no período: " + porc_f + "%");
			    System.out.println("Percentual de crianças do sexo masculino mortas no período: " + porc_m + "%");
			    System.out.println("Percentual de crianças com 24 meses ou menos mortas no período: " + porc_24 + "%");
			}
		}
    }
}
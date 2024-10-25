package org.factoriaf5.imc;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImcApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SpringApplication.run(ImcApplication.class, args);
		

		System.out.println("Ingrese su peso en kilos(con coma):");
		double peso = sc.nextDouble();
		System.out.println("Ingrese su altura en metros(con coma):");
		double altura = sc.nextDouble();

		System.out.println("Tu IMC es de " + imc(peso, altura));
		System.out.println("Tienes " + calcularIMC(peso, altura));
		sc.close();
	}

	public static double imc (double peso, double altura) {
		double imc = peso / (altura * altura);
		return imc;
	}

	public static String calcularIMC (double peso, double altura) {
		double imc = peso / (altura * altura);
		if (imc < 16) {
			return "Delgadez Severa";
			} else if (imc < 17) {
				return "Delgadez moderada";
				} else if (imc < 18.5) {
					return "Delgadez Leve";
				}  else if (imc < 25) {
					return "Peso Normal";
					} else if (imc < 30) {
						return "Sobrepeso";
					}  else if  (imc < 35) {
						return "Obesidad Leve";
					} else if (imc < 40){
						return "Obesidad Moderada";
					} else if  (imc >= 40) {
						return "Obesidad Mórbida";
					} else {
						return "Error";
					}
	}




}

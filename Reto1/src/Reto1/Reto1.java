package Reto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reto1 {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 1, consumoE, consumoA, consumoGN, estratoE, estratoA, estratoGN;
        double valorE, valorA, valorGN, costoE, costoA, costoGN, dto_stoE, dto_stoA, dto_stoGN, impuestoE, impuestoA, impuestoGN, totalGN, totalA, totalE;
        while (opcion >= 1 && opcion <= 4) {
            System.out.println("PAGO DE SERVICIOS PÚBLICOS");
            System.out.println("Seleccione el servicio público:");
            System.out.println("1.Energia");
            System.out.println("2.Acueducto");
            System.out.println("3.Gas Natural");
            System.out.println("4.Salir");
            System.out.println("Opción:");
            opcion = Integer.parseInt(leer.readLine());
            switch (opcion) {
                 case 1:
                    System.out.println("Pago de Servicio de Energia");
                    System.out.println("Estrato del inmueble:");
                    estratoE = Integer.parseInt(leer.readLine());
                    System.out.println("Consumo del inmueble:");
                    consumoE = Integer.parseInt(leer.readLine());
                    Energia objE = new Energia();
                    objE.setEstratoE(estratoE);
                    objE.setConsumoE(consumoE);
                    objE.calcular_totalE();
                    break;
                case 2:
                    System.out.println("Pago de Servicio de Acueducto");
                    System.out.println("Estrato del inmueble:");
                    estratoA = Integer.parseInt(leer.readLine());
                    System.out.println("Consumo del inmueble:");
                    consumoA = Integer.parseInt(leer.readLine());
                    Acueducto objA = new Acueducto();
                    objA.setEstratoA(estratoA);
                    objA.setConsumoA(consumoA);
                    objA.calcular_totalA();
                    break;
                case 3:
                    System.out.println("Pago de Servicio de Gas Natural");
                    System.out.println("Estrato del inmueble:");
                    estratoGN = Integer.parseInt(leer.readLine());
                    System.out.println("Consumo del inmueble:");
                    consumoGN = Integer.parseInt(leer.readLine());
                    GasNatural objGN = new GasNatural();
                    objGN.setEstratoGN(estratoGN);
                    objGN.setConsumoGN(consumoGN);
                    objGN.calcular_totalGN();
                    break;
                case 4:
                    System.out.println("Hasta pronto");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}

import com.oneg8.conversormonedas.Conversion;
import com.oneg8.conversormonedas.ConvertCurrencies;
import com.oneg8.conversormonedas.SeedCurrencies;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SeedCurrencies seed = new SeedCurrencies();
        ConvertCurrencies convert = new ConvertCurrencies();
        boolean continueConversion = true;

        System.out.println("\n¡Bienvenido al sistema Conversor de Monedas ONE-G8!\n");
        
        do {
            System.out.println("\n------------------------------------------------------------" +
                    "\n\n¿Desde qué tipo de moneda vas a convertir?");

            for (int i = 0; i < seed.getCurrencies().size(); i++) {
                System.out.println("\t" + (i+1) + ") " + seed.getCurrencies().get(i).code());
            }

            int option1;
            do {
                System.out.print("Ingresa la opción y ENTER para continuar: ");
                option1 = scanner.nextInt();
                if (option1 < 1 || option1 > 7) System.out.println("¡Opción no válida! Intente de nuevo\n");
            } while(option1 < 1 || option1 > 7);

            System.out.println("\n¿A que tipo de moneda quiere la conversion?");

            for (int i = 0; i < seed.getCurrencies().size(); i++) {
                if ((i+1) != option1)
                    System.out.println("\t" + (i+1) + ") " + seed.getCurrencies().get(i).code());
            }

            int option2;
            do {
                System.out.print("Ingresa la opción y ENTER para continuar: ");
                option2 = scanner.nextInt();
                if (option2 < 1 || option2 > 7 || option2 == option1) System.out.println("¡Opción no válida! Intente de nuevo\n");
            } while(option2 < 1 || option2 > 7 || option2 == option1);

            System.out.print("\nIngrese el monto (en " + seed.getCurrencies().get(option1 - 1).code() + ") a convertir: $");
            double amount = scanner.nextDouble();
            scanner.nextLine();

            try {
                Conversion result = convert.convertAmountFromTo(amount, seed.getCurrencies().get(option1-1).code(), seed.getCurrencies().get(option2-1).code());
                if (result.result().equalsIgnoreCase("success")) {
                    System.out.println("\n\nRESULTADO: $" + amount + " " + seed.getCurrencies().get(option1-1).code() +
                            " equivalen a $" + result.conversion_result() + " " + seed.getCurrencies().get(option2-1).code() + ".");
                } else
                    System.out.println("\n\nHubo un fallo en la conversión, intente de nuevo. Si el problema persiste contacte a Soporte Técnico. ");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            String confirmation;
            do {
                System.out.print("\n\n¿Desea continuar con las operaciones de conversión? (S/N) ");
                confirmation = scanner.nextLine();
                if (confirmation.equalsIgnoreCase("s")) {
                    continue;
                } else if (confirmation.equalsIgnoreCase("n")) {
                    continueConversion = false;
                } else System.out.println("Opción no válida! Intente de nuevo. ");
            } while (!confirmation.equalsIgnoreCase("n") && !confirmation.equalsIgnoreCase("s"));

        } while (continueConversion);

        System.out.println("\n\nGracias por su visita, ¡Que tenga excelente día!\n\n");

    }
}
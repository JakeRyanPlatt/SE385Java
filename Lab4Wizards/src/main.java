import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Mage> mages = new ArrayList<>();
        String input;

        System.out.println("Enter mage types (Mage, Sorcerer, Wizard, Warlock). Type 'done' to finish.");

        do {
            System.out.print("Enter mage type: ");
            input = scanner.nextLine().trim();

            switch (input.toLowerCase()) {
                case "mage"     -> mages.add(new Mage());
                case "sorcerer" -> mages.add(new Sorcerer());
                case "wizard"   -> mages.add(new wizard());
                case "warlock"  -> mages.add(new Warlock());
                case "done"     -> System.out.println("Building your party...");
                default         -> System.out.println("Unknown type, try: Mage, Sorcerer, Wizard, Warlock");
            }

            if (!input.equalsIgnoreCase("done") && !input.isEmpty()) {
                System.out.println(input + " added! Enter another mage type 'done' to finish");
                //scanner.nextLine();
            }

        } while (!input.equalsIgnoreCase("done"));

        System.out.println("\n--- Your Mage Party ---");
        for (Mage m : mages) {
            m.catchPhrase();
            m.attack();
            System.out.println();
        }

        scanner.close();
    }
}
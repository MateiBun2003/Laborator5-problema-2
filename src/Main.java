import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("Lab5prob2");
            Scanner scanner = new Scanner(file);
            Map<Persoana, Integer> persoaneCounts = new HashMap<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                Persoana p = new Persoana(parts[0], parts[1]);
                persoaneCounts.put(p, persoaneCounts.getOrDefault(p, 0) + 1);
            }

            for (Map.Entry<Persoana, Integer> entry : persoaneCounts.entrySet()) {
                if (entry.getValue() >= 3) {
                    System.out.println(entry.getKey().prenume + " " + entry.getKey().nume);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fișierul nu a fost găsit sau nu conține linii valide");
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Animal> animals = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        String flag;
        do {
            inputData();
            System.out.print("Do you want to add new animal? (yes/no): ");
            flag = br.readLine();
        } while (flag.equalsIgnoreCase("yes"));
        displayAnimals();
    }

    public static void displayAnimals() {
        System.out.println();
        System.out.println("Total number of animals: " + animals.size());
        System.out.println();
        int i = 1;
        for (Animal animal : animals) {
            System.out.println("Animal " + i + ": " );
            animal.display();
            i++;
            System.out.println();
        }
    }

    public static void inputData() throws IOException {
        Animal animal = new Animal();
        System.out.print("Enter the name of the animal: ");
        animal.name = br.readLine();
        System.out.print("Enter the age of the animal: ");
        animal.age = Integer.parseInt(br.readLine());
        System.out.print("Enter the species of the animal: ");
        animal.species = br.readLine();
        animals.add(animal);
    }
}

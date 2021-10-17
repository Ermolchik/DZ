package VeterinaryСlinic;

import java.util.Objects;
import java.util.Scanner;

public class Client extends User{

    String nameAnimal;
    String animal;  // Собака, кошка и т.д.
    int ageAnimal;
    String nameClient;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return ageAnimal == client.ageAnimal && Objects.equals(nameAnimal, client.nameAnimal) && Objects.equals(animal, client.animal) && Objects.equals(nameClient, client.nameClient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAnimal, animal, ageAnimal, nameClient);
    }

    Client() {
        this.nameClient = nameClient;
        this.nameAnimal = nameAnimal;
        this.animal = animal;
        this.ageAnimal = ageAnimal;

        System.out.println("Введите Ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        this.nameClient = scanner.next();

        System.out.println("Введите имя питомца: ");
        Scanner scanner2 = new Scanner(System.in);
        this.nameAnimal = scanner2.nextLine();

        System.out.println("Введите вид питомца(кошка, собака и т.д.): ");
        Scanner scanner3 = new Scanner(System.in);
        this.animal = scanner3.nextLine();

        System.out.println("Введите возраст питомца:");
        Scanner scanner4 = new Scanner(System.in);
        this.ageAnimal = scanner4.nextInt();

        AnimalClinic.patients++;
    }

    @Override
    public String toString() {
        return "Клиент: " + nameClient + ". ----- Питомец: " + nameAnimal +" "+ animal + " "+ "Возраст " + ageAnimal;
    }
}

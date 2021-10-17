package VeterinaryСlinic;

import java.util.Scanner;

import static VeterinaryСlinic.AnimalClinic.*;

public class Doctor extends User {

    public void doctor() {
        String answer2;
        System.out.println("Вы хотите выписать питомца из клиники?(Да/Нет)");
        Scanner scanner = new Scanner(System.in);
        answer2 = scanner.nextLine();
        switch (answer2) {
            case "Да":
                minusPatient();
                newUser();
                break;
            case "Нет":
                menu();
        }
    }

    public void minusPatient() {

        System.out.println("Я выписываю вашего питомца, он здоров!");
        clients.remove(2);
        AnimalClinic.patients--;
    }
}

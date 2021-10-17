package VeterinaryСlinic;

import java.util.Scanner;

import static VeterinaryСlinic.AnimalClinic.menu;
import static VeterinaryСlinic.AnimalClinic.newUser;

public class Administrator extends User {

    public void admin() {
        String answer;
        System.out.println("Вывести информацию, о животных которые находятся у нас на лечении?(Да/Нет)");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine();
        switch (answer){
            case "Да":
                getClients();
                newUser();
                break;
            case "Нет":
                menu();
        }

    }

    public void getClients() {

        System.out.println("Количество клиентов: ");
        System.out.println(AnimalClinic.patients);
        AnimalClinic.clients.stream().forEach(a -> System.out.println(a.toString()));

    }
}

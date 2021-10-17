package VeterinaryСlinic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalClinic {

    static int patients = 0;
    static List<Client> clients = new ArrayList<>();
    static Doctor doctors;
    static Administrator admin;
    static int choice;


    static public void newUser() {
        System.out.println("Добрый день, введите пожалуйста вашу роль: Клиент, Врач или Администратор.");
        Scanner scanner = new Scanner(System.in);
        String role = scanner.nextLine();
        switch (role) {
            case "Клиент":
                System.out.println("Уважаемый клиент укажите пожалуйста данные.");
                clients.add(new Client());
                choice = 1;
                break;

            case "Врач":
                doctors = new Doctor();
                doctors.doctor();
                break;

            case "Администратор":

                admin = new Administrator();
                admin.admin();
                choice = 3;

        }
        menu();

    }

    static void menu() {
        System.out.println("Хотите выйти в главное меню?(Да/Нет)");
        Scanner scanner6 = new Scanner(System.in);
        String no = scanner6.nextLine();
        switch (no) {
            case "Нет":
                clients.add(new Client());
                menu();
                break;
            case "Да":
                newUser();
                break;
            default:

        }

    }

}

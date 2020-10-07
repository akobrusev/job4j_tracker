package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                item.setName(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all Items ====");
                Item[] item = tracker.findAll();
                    for (int index = 0; index < item.length; index++) {
                        System.out.println(item[index].getId() + " " + item[index].getName());
                    }
            } else if (select == 2) {
                System.out.println("=== Edit Item ====");
                System.out.println("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item();
                item.setName(name);
                tracker.replace(id, item);
                if (tracker.replace(id, item)) {
                    System.out.println("Замена проведена");
                } else {
                    System.out.println("Заявка с таким данными не найдена");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ====");
                System.out.println("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                    if (id != -1) {
                        tracker.delete(id);
                    } else {
                        System.out.println("Заявка с таким id не найдена");
                    }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.println("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                Item item = tracker.findById(id);
                    if (item != null) {
                        System.out.println(item.getId() + " " + item.getName());
                    } else {
                        System.out.println("Заявка с таким id не найдена");
                    }
            } else if (select == 5) {
                    System.out.println("=== Find items by name ====");
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    Item[] item = tracker.findByName(name);
                    if (item.length > 0) {
                        for (int index = 0; index < item.length; index++) {
                            System.out.println(item[index].getId() + " " + item[index].getName());
                        }
                    } else {
                        System.out.println("Заявки с таким именем не найдены");
                    }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}

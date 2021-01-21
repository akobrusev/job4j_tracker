package ru.job4j.tracker;


public class FindByName implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] item = tracker.findByName(name);
        if (item.length > 0) {
            for (int index = 0; index < item.length; index++) {
                System.out.println(item[index].getId() + " " + item[index].getName());
            }
        } else {
            System.out.println("Заявки с таким именем не найдены");
        }
        return true;
    }
}
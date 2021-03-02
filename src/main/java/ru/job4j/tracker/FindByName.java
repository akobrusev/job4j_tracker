package ru.job4j.tracker;


public class FindByName implements UserAction {

    private final Output out;

    public FindByName(Output out) {
        this.out = out;
    }

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
                out.println(item[index].getId() + " " + item[index].getName());
            }
        } else {
            out.println("Заявки с таким именем не найдены");
        }
        return true;
    }
}
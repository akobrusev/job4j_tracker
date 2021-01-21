package ru.job4j.tracker;


public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return "=== Delete Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter id: "));
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена");
        } else {
            System.out.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
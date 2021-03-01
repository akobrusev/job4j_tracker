package ru.job4j.tracker;


public class ReplaceAction implements UserAction {

    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "=== Edit Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter id: "));
        String name = input.askStr("Enter name: ");
        Item item = new Item();
        item.setName(name);
        if (tracker.replace(id, item)) {
            out.println("Замена проведена");
        } else {
            out.println("Заявка с таким данными не найдена");
        }
        return true;
    }
}
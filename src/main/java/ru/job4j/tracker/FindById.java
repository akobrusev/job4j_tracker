package ru.job4j.tracker;


public class FindById implements UserAction {

    private final Output out;

    public FindById(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "=== Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter id: "));
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item.getId() + " " + item.getName());
        } else {
            out.println("Заявка с таким id не найдена");
        }
        return true;
    }
}
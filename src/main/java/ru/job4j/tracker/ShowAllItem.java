package ru.job4j.tracker;


public class ShowAllItem implements UserAction {

    private final Output out;

    public ShowAllItem(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Show all Items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] item = tracker.findAll();
        for (int index = 0; index < item.length; index++) {
            out.println(item[index].getId() + " " + item[index].getName());
          }
        return true;
    }
}
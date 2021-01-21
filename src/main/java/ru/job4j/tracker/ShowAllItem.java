package ru.job4j.tracker;


public class ShowAllItem implements UserAction {
    @Override
    public String name() {
        return "=== Show all Items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] item = tracker.findAll();
        for (int index = 0; index < item.length; index++) {
            System.out.println(item[index].getId() + " " + item[index].getName());
          }
        return true;
    }
}
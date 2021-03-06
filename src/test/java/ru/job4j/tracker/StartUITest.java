package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit program" + System.lineSeparator()
        ));
    }
    @Test
    public void whenShowAllItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0","1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ShowAllItem(out),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() + "0. === Show all Items ====" + System.lineSeparator() +
                        "1. Exit program" + System.lineSeparator() + "Menu." + System.lineSeparator() +
                        "0. === Show all Items ====" + System.lineSeparator() +
                        "1. Exit program" + System.lineSeparator()
        ));
    }
    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1", "1"}
        );
        Tracker  tracker = new Tracker();
        UserAction[] actions = {
                new FindByName(out),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() + "0. === Find items by name ====" + System.lineSeparator() +
                        "1. Exit program" + System.lineSeparator() + "Заявки с таким именем не найдены"
                        + System.lineSeparator() + "Menu." + System.lineSeparator() +
                        "0. === Find items by name ====" + System.lineSeparator() +
                        "1. Exit program" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindById() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1", "1"}
        );
        Tracker  tracker = new Tracker();
        UserAction[] actions = {
                new FindById(out),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() + "0. === Find item by Id ====" + System.lineSeparator() +
                        "1. Exit program" + System.lineSeparator() + "Заявка с таким id не найдена"
                        + System.lineSeparator() + "Menu." + System.lineSeparator() +
                        "0. === Find item by Id ====" + System.lineSeparator() +
                        "1. Exit program" + System.lineSeparator()
        ));
    }

}
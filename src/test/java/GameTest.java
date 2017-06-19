import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MaolmeoX on 19/06/2017.
 */
public class GameTest {
    @Test
    public void getTemplate1() throws Exception {
        Game game = new Game();
        assertTrue(game.getTemplate1().getClass() == Template.class);
    }

    @Test
    public void setTemplate1() throws Exception {
    }

    @Test
    public void getTemplate2() throws Exception {
        Game game = new Game();
        assertTrue(game.getTemplate2().getClass() == Template.class);
    }

    @Test
    public void setTemplate2() throws Exception {
    }

    @Test
    public void chooseTemplate() throws Exception {
        Game game = new Game();
        assertTrue(game.chooseTemplate().getClass() == Template.class);
    }

    @Test
    public void chooseString() throws Exception {
        Game game = new Game();
        assertTrue(game.chooseString().getClass() == String.class);
    }

    @Test
    public void printResult() throws Exception {
    }

    @Test
    public void printTemplate() throws Exception {
    }

}
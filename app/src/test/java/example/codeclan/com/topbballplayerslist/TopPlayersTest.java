package example.codeclan.com.topbballplayerslist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/04/2017.
 */

public class TopPlayersTest {

    @Test
    public void getListTest() {
        TopPlayers topPlayers = new TopPlayers();
        assertEquals(20, topPlayers.getList().size());
    }
}

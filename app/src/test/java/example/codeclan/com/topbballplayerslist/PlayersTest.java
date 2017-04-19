package example.codeclan.com.topbballplayerslist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/04/2017.
 */

public class PlayersTest {

    Players players;

    @Before
    public void before() {
        players = new Players(21, "Bob Pettit", "St.Louis Hawks");
    }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)21, players.getRanking());

    }

    @Test
    public void getNameTest() {
        assertEquals("Bob Pettit", players.getName());

    }

    @Test
    public void getTeamTest() {
        assertEquals("St.Louis Hawks", players.getTeam());

    }
}

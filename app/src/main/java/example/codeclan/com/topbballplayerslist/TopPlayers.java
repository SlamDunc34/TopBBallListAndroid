package example.codeclan.com.topbballplayerslist;

import java.util.ArrayList;

/**
 * Created by user on 19/04/2017.
 */

public class TopPlayers {

    private ArrayList<Players> list;

    public TopPlayers() {
        list = new ArrayList<Players>();
        list.add(new Players(1, "Bill Russell", "Boston Celtics"));
        list.add(new Players(2, "Larry Bird", "Boston Celtics"));
        list.add(new Players(3, "John Havlicek", "Boston Celtics"));
        list.add(new Players(4, "Bob Cousy", "Boston Celtics"));
        list.add(new Players(5, "Kevin McHale", "Boston Celtics"));
        list.add(new Players(6, "Paul Pierce", "Boston Celtics"));
        list.add(new Players(7, "Dave Cowens", "Boston Celtics"));
        list.add(new Players(8, "Sam Jones", "Boston Celtics"));
        list.add(new Players(9, "Tommy Heinsohn", "Boston Celtics"));
        list.add(new Players(10, "Isaiah Thomas", "Boston Celtics"));
        list.add(new Players(11, "Wilt Chamberlain", "Philadelphia Warriors"));
        list.add(new Players(12, "Oscar Robertson", "Milwaukee Bucks"));
        list.add(new Players(13, "Earvin Johnson", "Los Angeles Lakers"));
        list.add(new Players(14, "Hakeem Olajuwon", "Houston Rockets"));
        list.add(new Players(15, "Tim Duncan", "San Antonio Spurs"));
        list.add(new Players(16, "Moses Malone", "Washington Bullets"));
        list.add(new Players(17, "John Stockton", "Utah Jazz"));
        list.add(new Players(18, "Kareem Abdul-Jabbar", "Milwaukee Bucks"));
        list.add(new Players(19, "Michael Jordan", "Chicago Bulls"));
        list.add(new Players(20, "Kevin Garnett", "Boston Celtics"));
    }

    public ArrayList<Players> getList() {
        return new ArrayList<Players>(list);
    }

}

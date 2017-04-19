package example.codeclan.com.topbballplayerslist;

/**
 * Created by user on 19/04/2017.
 */

public class Players {

    private int ranking;
    private String name;
    private String team;

    public Players(Integer ranking, String name, String team) {
        this.ranking = ranking;
        this.name = name;
        this.team = team;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

}


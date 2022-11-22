import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    String name;
    ArrayList<T> league;

    public League(String name) {
        this.name = name;
        this.league = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (league.contains(team)) {
            System.out.println(team.getName() + " is already in the league");
            return false;
        } else {
            System.out.println(team.getName() + " added to the league");
            league.add(team);
            return true;
        }
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }

}

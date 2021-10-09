package uk.epl.game;

import uk.epl.player.Player;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<Player> players = new ArrayList<>();

    public void add(Player newPlayer) {
        players.add(newPlayer);
    }

    public void moveUp(int choosePlayer) {
        for (Player p : players){
            if (p.getJerseyNumber()==choosePlayer) p.moveUp();
        }
    }

    public void start() {
        for (Player p: players){
            if(p.state.equals("Forward")) p.setPosition(34,25);
            else if (p.state.equals("Midfielder")) p.setPosition(34,50);
            else p.setPosition(34,75);
        }
    }

    public void info() {
        for (Player p: players){
            System.out.println(p.toString());
        }
    }

    public void stop() {
    }
}

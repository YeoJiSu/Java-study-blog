package com.fm.repository;

import com.fm.unit.Player;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PlayerQuery {
    public static List<Player> query(List<Player> players, List<Predicate<Player>> conditions) {
        for (Predicate predicate : conditions){
            players= players.stream().filter(p->predicate.test(p)).collect(Collectors.toList());
        }
        return players;
    }
}

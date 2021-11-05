package com.fm.repository;

import com.fm.game.SearchCondition;
import com.fm.unit.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PlayerSearchPredicateFactory {
    public static List<Predicate<Player>> makeConditions(List<SearchCondition> searchConditions){
        List<Predicate<Player>> results = new ArrayList<>();
        for (SearchCondition search : searchConditions){
            if ("name".equals(search.getField())){
                results.add(p->p.getName().contains(search.getCondition()));
            }
            else if ("club".equals(search.getField())){
                results.add(p->p.getClub().contains(search.getCondition()));
            }
            else if ("nationality".equals(search.getField())){
                results.add(p->p.getNationality().contains(search.getCondition()));
            }
            else if ("position".equals(search.getField())){
                results.add(p->p.getPositions().contains(search.getCondition()));
            }
        }
        return results;
    }
}

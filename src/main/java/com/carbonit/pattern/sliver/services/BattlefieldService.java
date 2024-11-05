package com.carbonit.pattern.sliver.services;

import com.carbonit.pattern.sliver.factories.SliverFactory;
import com.carbonit.pattern.sliver.model.SliverPower;
import com.carbonit.pattern.sliver.strategies.skills.SkillStrategy;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BattlefieldService {


    //A compléter
    public void displayBattlefield(List<SliverPower> sliverPowerTypes) {
        Map<String, Long> skillCount = countingStackableSkills(sliverPowerTypes);
        List<SkillStrategy> nonStackableCount = countingNonStackableSkills(sliverPowerTypes);
        System.out.println("Tous les slivoïdes ont : ");
        skillCount.forEach((skillName, count) -> System.out.println(". " + skillName + " x" + count));
        nonStackableCount.forEach(skillName -> System.out.println(". " + "nom de la compétence"));
    }
    //A compléter
    private Map<String, Long> countingStackableSkills(List<SliverPower> sliverPowerTypes) {
    return new HashMap<>();
    }
    //A compléter
    private List<SkillStrategy> countingNonStackableSkills(List<SliverPower> sliverPowerTypes) {
    return new ArrayList<>();
    }
}

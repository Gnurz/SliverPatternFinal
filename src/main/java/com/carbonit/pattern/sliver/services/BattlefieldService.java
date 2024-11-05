package com.carbonit.pattern.sliver.services;

import com.carbonit.pattern.sliver.factories.SliverFactory;
import com.carbonit.pattern.sliver.model.SliverPower;
import com.carbonit.pattern.sliver.strategies.skills.SkillStrategy;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BattlefieldService {
    private final SliverFactory sliverFactory;

    public void displayBattlefield(List<SliverPower> sliverPowerTypes) {
        Map<String, Long> skillCount = countingStackableSkills(sliverPowerTypes);
        List<SkillStrategy> nonStackableCount = countingNonStackableSkills(sliverPowerTypes);
        System.out.println("Tous les slivoïdes ont : ");
        skillCount.forEach((skillName, count) -> System.out.println(". " + skillName + " x" + count));
        nonStackableCount.forEach(skillName -> System.out.println(". " + skillName.applySkill()));
    }

    private Map<String, Long> countingStackableSkills(List<SliverPower> sliverPowerTypes) {
    return sliverPowerTypes.stream()
            .map(sliverFactory::getSliverSkill)
            .filter(SkillStrategy::isStackable)
            .collect(Collectors.groupingBy(SkillStrategy::applySkill, Collectors.counting()));
    }
    private List<SkillStrategy> countingNonStackableSkills(List<SliverPower> sliverPowerTypes) {
    return sliverPowerTypes.stream()
            .map(sliverFactory::getSliverSkill)
            .filter(skill -> !skill.isStackable())
            .distinct()
            .collect(Collectors.toList());
    }
}

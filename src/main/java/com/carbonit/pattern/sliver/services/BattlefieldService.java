package com.carbonit.pattern.sliver.services;

import com.carbonit.pattern.sliver.factories.SliverFactory;
import com.carbonit.pattern.sliver.model.SliverPower;
import com.carbonit.pattern.sliver.strategies.skills.SkillStrategy;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BattlefieldService {
    private final SliverFactory sliverFactory;

    public void displayBattlefield(List<SliverPower> sliverPowerTypes) {

        System.out.println("Tous les slivoïdes ont : ");
        sliverPowerTypes.forEach(power -> {
            SkillStrategy skill = sliverFactory.getSliverSkill(power);
            System.out.println(". " + skill.applySkill());
        });
    }
}

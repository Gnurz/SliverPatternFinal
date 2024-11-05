package com.carbonit.pattern.sliver.factories;

import com.carbonit.pattern.sliver.model.SliverPower;
import com.carbonit.pattern.sliver.strategies.skills.SkillNotFound;
import com.carbonit.pattern.sliver.strategies.skills.SkillStrategy;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@AllArgsConstructor
public class SliverFactory {

    private final Set<SkillStrategy> skillsStrategies;
    private final SkillNotFound skillNotFound;


    public SkillStrategy getSliverSkill(SliverPower power) {
        return skillsStrategies.stream()
                .filter(skill -> skill.isApplicable(power))
                .findFirst()
                .orElse(skillNotFound);
    }

}

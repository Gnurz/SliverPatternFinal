package com.carbonit.pattern.sliver.strategies.skills;

import com.carbonit.pattern.sliver.model.SliverPower;
import org.springframework.stereotype.Component;

@Component
public class SkillNotFound implements SkillStrategy {

    @Override
    public String applySkill() {
        return "La compétence est inconnue";
    }

    @Override
    public boolean isApplicable(SliverPower type) {
        return false;
    }
}

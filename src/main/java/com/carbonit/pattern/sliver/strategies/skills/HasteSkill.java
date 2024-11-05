package com.carbonit.pattern.sliver.strategies.skills;

import com.carbonit.pattern.sliver.model.SliverPower;
import org.springframework.stereotype.Component;

@Component
public class HasteSkill implements SkillStrategy{
    @Override
    public String applySkill() {
        return "Célérité";
    }

    @Override
    public boolean isApplicable(SliverPower skill) {
        return skill==SliverPower.HASTE;
    }

    @Override
    public boolean isStackable() {
        return false;
    }
}

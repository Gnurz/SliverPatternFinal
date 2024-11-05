package com.carbonit.pattern.sliver.strategies.skills;


import com.carbonit.pattern.sliver.model.SliverPower;

public interface SkillStrategy {
    String applySkill();
    boolean isApplicable(SliverPower type);
    boolean isStackable();
}

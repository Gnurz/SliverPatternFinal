package com.carbonit.pattern.sliver.strategies.skills;


import com.carbonit.pattern.sliver.model.SliverPower;
import org.springframework.stereotype.Component;

@Component
public class PowerOneAndThougnessOneBoost implements SkillStrategy {

    @Override
    public String applySkill() {
        return "+1/+1";
    }

    @Override
    public boolean isApplicable(SliverPower skill) {
        return skill == SliverPower.STRENGTHONE_THOUGNESSONE_BOOST;
    }
}

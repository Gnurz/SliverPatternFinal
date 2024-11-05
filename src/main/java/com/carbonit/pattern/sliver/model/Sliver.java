package com.carbonit.pattern.sliver.model;

import com.carbonit.pattern.sliver.strategies.skills.SkillStrategy;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Sliver {

    private final SkillStrategy skillStrategy;

    public String getSkill(){
        return skillStrategy.applySkill();
    }
}

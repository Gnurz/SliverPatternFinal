package com.carbonit.pattern.sliver.factories;

import com.carbonit.pattern.sliver.model.SliverPower;
import com.carbonit.pattern.sliver.strategies.skills.SkillNotFound;
import com.carbonit.pattern.sliver.strategies.skills.SkillStrategy;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;


public class SliverFactory {


    //A implémenter
    public SkillStrategy getSliverSkill(SliverPower power) {
        return null;
    }

}

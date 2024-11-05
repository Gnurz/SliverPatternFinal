package com.carbonit.pattern.sliver;

import com.carbonit.pattern.sliver.factories.SliverFactory;
import com.carbonit.pattern.sliver.model.Sliver;
import com.carbonit.pattern.sliver.model.SliverPower;
import com.carbonit.pattern.sliver.services.BattlefieldService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@AllArgsConstructor
public class SliverLauncher implements CommandLineRunner {

    private final SliverFactory sliverFactory;
    private final BattlefieldService battlefieldService;


    @Override
    public void run(String... args) throws Exception {
        List<SliverPower> sliverPowers = Arrays.asList(
                SliverPower.FLYING,
                SliverPower.HASTE,
                SliverPower.STRENGTHONE_THOUGNESSONE_BOOST,
                SliverPower.STRENGTHONE_THOUGNESSONE_BOOST
        );
        battlefieldService.displayBattlefield(sliverPowers);
    }
}

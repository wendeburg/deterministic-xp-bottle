package com.nonsenz.deterministicxpbottles.config;

import com.nonsenz.deterministicxpbottles.DeterministicXPBottles;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = DeterministicXPBottles.MOD_ID)
public class DeterminisitcXPBottlesConfig implements ConfigData {
    @Comment("The amount of experience dropped by XP bottles.")
    public int droppedXP = 10;
}
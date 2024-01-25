package com.nonsenz.deterministicxpbottles;

import com.nonsenz.deterministicxpbottles.config.DeterminisitcXPBottlesConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeterministicXPBottles implements ModInitializer {
	public static final String MOD_ID = "deterministic-xp-bottles";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		AutoConfig.register(DeterminisitcXPBottlesConfig.class, JanksonConfigSerializer::new);
		LOGGER.info("Initialized " + MOD_ID);
	}
}
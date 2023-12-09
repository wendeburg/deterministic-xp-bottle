package com.nonsenz.deterministicxpbottles;

import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ModInitializer;

import com.nonsenz.deterministicxpbottles.config.DeterministicXPBottlesConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeterministicXPBottles implements ModInitializer {
	public static final String MOD_ID = "deterministic-xp-bottles";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		MidnightConfig.init(MOD_ID, DeterministicXPBottlesConfig.class);
		LOGGER.info("Initialized " + MOD_ID);
	}
}
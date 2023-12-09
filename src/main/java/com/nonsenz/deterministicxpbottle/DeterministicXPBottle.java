package com.nonsenz.deterministicxpbottle;

import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ModInitializer;

import com.nonsenz.deterministicxpbottle.config.DeterministicXPBottleConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeterministicXPBottle implements ModInitializer {
	public static final String MOD_ID = "deterministic-xp-bottle";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		MidnightConfig.init(MOD_ID, DeterministicXPBottleConfig.class);
		LOGGER.info("Initialized " + MOD_ID);
	}
}
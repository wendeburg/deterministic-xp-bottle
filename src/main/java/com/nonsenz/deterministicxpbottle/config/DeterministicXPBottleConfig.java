package com.nonsenz.deterministicxpbottle.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class DeterministicXPBottleConfig extends MidnightConfig {
    @Entry(category = "numbers", min=1, max=100) public static int droppedXPAmmount = 10;
}

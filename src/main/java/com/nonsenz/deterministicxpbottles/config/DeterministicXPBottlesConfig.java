package com.nonsenz.deterministicxpbottles.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class DeterministicXPBottlesConfig extends MidnightConfig {
    @Entry(category = "numbers", min=1, max=100) public static int droppedXPAmount = 10;
}

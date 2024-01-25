package com.nonsenz.deterministicxpbottles.mixin;

import com.nonsenz.deterministicxpbottles.config.DeterminisitcXPBottlesConfig;
import me.shedaniel.autoconfig.AutoConfig;
import net.minecraft.world.entity.projectile.ThrownExperienceBottle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ThrownExperienceBottle.class)
public class ExperienceBottleEntityMixin {
	@ModifyVariable(method = "onHit", at = @At("STORE"), ordinal = 0)
	private int init(int randomXPAmount) {
		// ignore the random xp amount.
		// return the constant amount.
		DeterminisitcXPBottlesConfig config = AutoConfig.getConfigHolder(DeterminisitcXPBottlesConfig.class).getConfig();
		return config.droppedXP;
	}
}
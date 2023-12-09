package com.nonsenz.deterministicxpbottles.mixin;

import net.minecraft.entity.projectile.thrown.ExperienceBottleEntity;
import com.nonsenz.deterministicxpbottles.config.DeterministicXPBottlesConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ExperienceBottleEntity.class)
public class ExperienceBottleEntityMixin {
	@ModifyVariable(method = "onCollision", at = @At("STORE"), ordinal = 0)
	private int init(int randomXPAmount) {
		// ignore the random xp amount.
		// return the constant amount.
		return DeterministicXPBottlesConfig.droppedXPAmount;
	}
}
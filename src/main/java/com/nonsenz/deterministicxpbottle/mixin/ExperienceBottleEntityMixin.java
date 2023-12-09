package com.nonsenz.deterministicxpbottle.mixin;

import net.minecraft.entity.projectile.thrown.ExperienceBottleEntity;
import com.nonsenz.deterministicxpbottle.config.DeterministicXPBottleConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ExperienceBottleEntity.class)
public class ExperienceBottleEntityMixin {
	@ModifyVariable(method = "onCollision", at = @At("STORE"), ordinal = 0)
	private int init(int randomXPAmmount) {
		// ignore the random xp ammount.
		// return the constant ammount.
		return DeterministicXPBottleConfig.droppedXPAmmount;
	}
}
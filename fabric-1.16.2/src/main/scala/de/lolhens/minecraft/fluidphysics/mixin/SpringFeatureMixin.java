package de.lolhens.minecraft.fluidphysics.mixin;

import de.lolhens.minecraft.fluidphysics.util.SpringBlockFeature;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.SpringFeature;
import net.minecraft.world.gen.feature.SpringFeatureConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(SpringFeature.class)
public class SpringFeatureMixin {
    @Inject(at = @At("RETURN"), method = "generate", cancellable = true)
    public void generate(StructureWorldAccess structureWorldAccess,
                         ChunkGenerator chunkGenerator,
                         Random random,
                         BlockPos blockPos,
                         SpringFeatureConfig springFeatureConfig,
                         CallbackInfoReturnable<Boolean> info) {
        if (info.getReturnValue()) {
            SpringBlockFeature.generate(structureWorldAccess, blockPos, springFeatureConfig);
        }
    }
}

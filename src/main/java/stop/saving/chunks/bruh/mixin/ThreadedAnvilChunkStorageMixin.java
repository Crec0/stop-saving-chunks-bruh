package stop.saving.chunks.bruh.mixin;

import net.minecraft.server.level.ChunkMap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ChunkMap.class)
public class ThreadedAnvilChunkStorageMixin {
    @ModifyConstant(method = "processUnloads", constant = @Constant(intValue = 0, ordinal = 2))
    private int disableSaving20Chunks(int original) {
        return 20; // Set to zero so while loop is not executed
    }
}

package net.minecraft.data.tags;

import java.nio.file.Path;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.GameEventTags;
import net.minecraft.world.level.gameevent.GameEvent;

public class GameEventTagsProvider extends TagsProvider<GameEvent> {
   @Deprecated
   public GameEventTagsProvider(DataGenerator pGenerator) {
      super(pGenerator, Registry.GAME_EVENT);
   }
   public GameEventTagsProvider(DataGenerator pGenerator, String modId, @javax.annotation.Nullable net.minecraftforge.common.data.ExistingFileHelper existingFileHelper) {
      super(pGenerator, Registry.GAME_EVENT, modId, existingFileHelper);
   }

   protected void addTags() {
      this.tag(GameEventTags.VIBRATIONS).add(GameEvent.BLOCK_ATTACH, GameEvent.BLOCK_CHANGE, GameEvent.BLOCK_CLOSE, GameEvent.BLOCK_DESTROY, GameEvent.BLOCK_DETACH, GameEvent.BLOCK_OPEN, GameEvent.BLOCK_PLACE, GameEvent.BLOCK_PRESS, GameEvent.BLOCK_SWITCH, GameEvent.BLOCK_UNPRESS, GameEvent.BLOCK_UNSWITCH, GameEvent.CONTAINER_CLOSE, GameEvent.CONTAINER_OPEN, GameEvent.DISPENSE_FAIL, GameEvent.DRINKING_FINISH, GameEvent.EAT, GameEvent.ELYTRA_FREE_FALL, GameEvent.ENTITY_DAMAGED, GameEvent.ENTITY_KILLED, GameEvent.ENTITY_PLACE, GameEvent.EQUIP, GameEvent.EXPLODE, GameEvent.FISHING_ROD_CAST, GameEvent.FISHING_ROD_REEL_IN, GameEvent.FLAP, GameEvent.FLUID_PICKUP, GameEvent.FLUID_PLACE, GameEvent.HIT_GROUND, GameEvent.MOB_INTERACT, GameEvent.LIGHTNING_STRIKE, GameEvent.MINECART_MOVING, GameEvent.PISTON_CONTRACT, GameEvent.PISTON_EXTEND, GameEvent.PRIME_FUSE, GameEvent.PROJECTILE_LAND, GameEvent.PROJECTILE_SHOOT, GameEvent.RAVAGER_ROAR, GameEvent.RING_BELL, GameEvent.SHEAR, GameEvent.SHULKER_CLOSE, GameEvent.SHULKER_OPEN, GameEvent.SPLASH, GameEvent.STEP, GameEvent.SWIM, GameEvent.WOLF_SHAKING);
      this.tag(GameEventTags.IGNORE_VIBRATIONS_SNEAKING).add(GameEvent.HIT_GROUND, GameEvent.PROJECTILE_SHOOT, GameEvent.STEP, GameEvent.SWIM);
   }

   /**
    * Resolves a Path for the location to save the given tag.
    */
   protected Path getPath(ResourceLocation pId) {
      return this.generator.getOutputFolder().resolve("data/" + pId.getNamespace() + "/tags/game_events/" + pId.getPath() + ".json");
   }

   /**
    * Gets a name for this provider, to use in logging.
    */
   public String getName() {
      return "Game Event Tags";
   }
}

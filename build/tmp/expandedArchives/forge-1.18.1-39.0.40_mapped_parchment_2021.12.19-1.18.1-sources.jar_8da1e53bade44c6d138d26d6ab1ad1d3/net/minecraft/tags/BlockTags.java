package net.minecraft.tags;

import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;

public final class BlockTags {
   protected static final StaticTagHelper<Block> HELPER = StaticTags.create(Registry.BLOCK_REGISTRY, "tags/blocks");
   public static final Tag.Named<Block> WOOL = bind("wool");
   public static final Tag.Named<Block> PLANKS = bind("planks");
   public static final Tag.Named<Block> STONE_BRICKS = bind("stone_bricks");
   public static final Tag.Named<Block> WOODEN_BUTTONS = bind("wooden_buttons");
   public static final Tag.Named<Block> BUTTONS = bind("buttons");
   public static final Tag.Named<Block> CARPETS = bind("carpets");
   public static final Tag.Named<Block> WOODEN_DOORS = bind("wooden_doors");
   public static final Tag.Named<Block> WOODEN_STAIRS = bind("wooden_stairs");
   public static final Tag.Named<Block> WOODEN_SLABS = bind("wooden_slabs");
   public static final Tag.Named<Block> WOODEN_FENCES = bind("wooden_fences");
   public static final Tag.Named<Block> PRESSURE_PLATES = bind("pressure_plates");
   public static final Tag.Named<Block> WOODEN_PRESSURE_PLATES = bind("wooden_pressure_plates");
   public static final Tag.Named<Block> STONE_PRESSURE_PLATES = bind("stone_pressure_plates");
   public static final Tag.Named<Block> WOODEN_TRAPDOORS = bind("wooden_trapdoors");
   public static final Tag.Named<Block> DOORS = bind("doors");
   public static final Tag.Named<Block> SAPLINGS = bind("saplings");
   public static final Tag.Named<Block> LOGS_THAT_BURN = bind("logs_that_burn");
   public static final Tag.Named<Block> LOGS = bind("logs");
   public static final Tag.Named<Block> DARK_OAK_LOGS = bind("dark_oak_logs");
   public static final Tag.Named<Block> OAK_LOGS = bind("oak_logs");
   public static final Tag.Named<Block> BIRCH_LOGS = bind("birch_logs");
   public static final Tag.Named<Block> ACACIA_LOGS = bind("acacia_logs");
   public static final Tag.Named<Block> JUNGLE_LOGS = bind("jungle_logs");
   public static final Tag.Named<Block> SPRUCE_LOGS = bind("spruce_logs");
   public static final Tag.Named<Block> CRIMSON_STEMS = bind("crimson_stems");
   public static final Tag.Named<Block> WARPED_STEMS = bind("warped_stems");
   public static final Tag.Named<Block> BANNERS = bind("banners");
   public static final Tag.Named<Block> SAND = bind("sand");
   public static final Tag.Named<Block> STAIRS = bind("stairs");
   public static final Tag.Named<Block> SLABS = bind("slabs");
   public static final Tag.Named<Block> WALLS = bind("walls");
   public static final Tag.Named<Block> ANVIL = bind("anvil");
   public static final Tag.Named<Block> RAILS = bind("rails");
   public static final Tag.Named<Block> LEAVES = bind("leaves");
   public static final Tag.Named<Block> TRAPDOORS = bind("trapdoors");
   public static final Tag.Named<Block> SMALL_FLOWERS = bind("small_flowers");
   public static final Tag.Named<Block> BEDS = bind("beds");
   public static final Tag.Named<Block> FENCES = bind("fences");
   public static final Tag.Named<Block> TALL_FLOWERS = bind("tall_flowers");
   public static final Tag.Named<Block> FLOWERS = bind("flowers");
   public static final Tag.Named<Block> PIGLIN_REPELLENTS = bind("piglin_repellents");
   public static final Tag.Named<Block> GOLD_ORES = bind("gold_ores");
   public static final Tag.Named<Block> IRON_ORES = bind("iron_ores");
   public static final Tag.Named<Block> DIAMOND_ORES = bind("diamond_ores");
   public static final Tag.Named<Block> REDSTONE_ORES = bind("redstone_ores");
   public static final Tag.Named<Block> LAPIS_ORES = bind("lapis_ores");
   public static final Tag.Named<Block> COAL_ORES = bind("coal_ores");
   public static final Tag.Named<Block> EMERALD_ORES = bind("emerald_ores");
   public static final Tag.Named<Block> COPPER_ORES = bind("copper_ores");
   public static final Tag.Named<Block> NON_FLAMMABLE_WOOD = bind("non_flammable_wood");
   public static final Tag.Named<Block> CANDLES = bind("candles");
   public static final Tag.Named<Block> DIRT = bind("dirt");
   public static final Tag.Named<Block> TERRACOTTA = bind("terracotta");
   public static final Tag.Named<Block> FLOWER_POTS = bind("flower_pots");
   public static final Tag.Named<Block> ENDERMAN_HOLDABLE = bind("enderman_holdable");
   public static final Tag.Named<Block> ICE = bind("ice");
   public static final Tag.Named<Block> VALID_SPAWN = bind("valid_spawn");
   public static final Tag.Named<Block> IMPERMEABLE = bind("impermeable");
   public static final Tag.Named<Block> UNDERWATER_BONEMEALS = bind("underwater_bonemeals");
   public static final Tag.Named<Block> CORAL_BLOCKS = bind("coral_blocks");
   public static final Tag.Named<Block> WALL_CORALS = bind("wall_corals");
   public static final Tag.Named<Block> CORAL_PLANTS = bind("coral_plants");
   public static final Tag.Named<Block> CORALS = bind("corals");
   public static final Tag.Named<Block> BAMBOO_PLANTABLE_ON = bind("bamboo_plantable_on");
   public static final Tag.Named<Block> STANDING_SIGNS = bind("standing_signs");
   public static final Tag.Named<Block> WALL_SIGNS = bind("wall_signs");
   public static final Tag.Named<Block> SIGNS = bind("signs");
   public static final Tag.Named<Block> DRAGON_IMMUNE = bind("dragon_immune");
   public static final Tag.Named<Block> WITHER_IMMUNE = bind("wither_immune");
   public static final Tag.Named<Block> WITHER_SUMMON_BASE_BLOCKS = bind("wither_summon_base_blocks");
   public static final Tag.Named<Block> BEEHIVES = bind("beehives");
   public static final Tag.Named<Block> CROPS = bind("crops");
   public static final Tag.Named<Block> BEE_GROWABLES = bind("bee_growables");
   public static final Tag.Named<Block> PORTALS = bind("portals");
   public static final Tag.Named<Block> FIRE = bind("fire");
   public static final Tag.Named<Block> NYLIUM = bind("nylium");
   public static final Tag.Named<Block> WART_BLOCKS = bind("wart_blocks");
   public static final Tag.Named<Block> BEACON_BASE_BLOCKS = bind("beacon_base_blocks");
   public static final Tag.Named<Block> SOUL_SPEED_BLOCKS = bind("soul_speed_blocks");
   public static final Tag.Named<Block> WALL_POST_OVERRIDE = bind("wall_post_override");
   public static final Tag.Named<Block> CLIMBABLE = bind("climbable");
   public static final Tag.Named<Block> SHULKER_BOXES = bind("shulker_boxes");
   public static final Tag.Named<Block> HOGLIN_REPELLENTS = bind("hoglin_repellents");
   public static final Tag.Named<Block> SOUL_FIRE_BASE_BLOCKS = bind("soul_fire_base_blocks");
   public static final Tag.Named<Block> STRIDER_WARM_BLOCKS = bind("strider_warm_blocks");
   public static final Tag.Named<Block> CAMPFIRES = bind("campfires");
   public static final Tag.Named<Block> GUARDED_BY_PIGLINS = bind("guarded_by_piglins");
   public static final Tag.Named<Block> PREVENT_MOB_SPAWNING_INSIDE = bind("prevent_mob_spawning_inside");
   public static final Tag.Named<Block> FENCE_GATES = bind("fence_gates");
   public static final Tag.Named<Block> UNSTABLE_BOTTOM_CENTER = bind("unstable_bottom_center");
   public static final Tag.Named<Block> MUSHROOM_GROW_BLOCK = bind("mushroom_grow_block");
   public static final Tag.Named<Block> INFINIBURN_OVERWORLD = bind("infiniburn_overworld");
   public static final Tag.Named<Block> INFINIBURN_NETHER = bind("infiniburn_nether");
   public static final Tag.Named<Block> INFINIBURN_END = bind("infiniburn_end");
   public static final Tag.Named<Block> BASE_STONE_OVERWORLD = bind("base_stone_overworld");
   public static final Tag.Named<Block> STONE_ORE_REPLACEABLES = bind("stone_ore_replaceables");
   public static final Tag.Named<Block> DEEPSLATE_ORE_REPLACEABLES = bind("deepslate_ore_replaceables");
   public static final Tag.Named<Block> BASE_STONE_NETHER = bind("base_stone_nether");
   public static final Tag.Named<Block> CANDLE_CAKES = bind("candle_cakes");
   public static final Tag.Named<Block> CAULDRONS = bind("cauldrons");
   public static final Tag.Named<Block> CRYSTAL_SOUND_BLOCKS = bind("crystal_sound_blocks");
   public static final Tag.Named<Block> INSIDE_STEP_SOUND_BLOCKS = bind("inside_step_sound_blocks");
   public static final Tag.Named<Block> OCCLUDES_VIBRATION_SIGNALS = bind("occludes_vibration_signals");
   public static final Tag.Named<Block> DRIPSTONE_REPLACEABLE = bind("dripstone_replaceable_blocks");
   public static final Tag.Named<Block> CAVE_VINES = bind("cave_vines");
   public static final Tag.Named<Block> MOSS_REPLACEABLE = bind("moss_replaceable");
   public static final Tag.Named<Block> LUSH_GROUND_REPLACEABLE = bind("lush_ground_replaceable");
   public static final Tag.Named<Block> AZALEA_ROOT_REPLACEABLE = bind("azalea_root_replaceable");
   public static final Tag.Named<Block> SMALL_DRIPLEAF_PLACEABLE = bind("small_dripleaf_placeable");
   public static final Tag.Named<Block> BIG_DRIPLEAF_PLACEABLE = bind("big_dripleaf_placeable");
   public static final Tag.Named<Block> SNOW = bind("snow");
   public static final Tag.Named<Block> MINEABLE_WITH_AXE = bind("mineable/axe");
   public static final Tag.Named<Block> MINEABLE_WITH_HOE = bind("mineable/hoe");
   public static final Tag.Named<Block> MINEABLE_WITH_PICKAXE = bind("mineable/pickaxe");
   public static final Tag.Named<Block> MINEABLE_WITH_SHOVEL = bind("mineable/shovel");
   public static final Tag.Named<Block> NEEDS_DIAMOND_TOOL = bind("needs_diamond_tool");
   public static final Tag.Named<Block> NEEDS_IRON_TOOL = bind("needs_iron_tool");
   public static final Tag.Named<Block> NEEDS_STONE_TOOL = bind("needs_stone_tool");
   public static final Tag.Named<Block> FEATURES_CANNOT_REPLACE = bind("features_cannot_replace");
   public static final Tag.Named<Block> LAVA_POOL_STONE_CANNOT_REPLACE = bind("lava_pool_stone_cannot_replace");
   public static final Tag.Named<Block> GEODE_INVALID_BLOCKS = bind("geode_invalid_blocks");
   public static final Tag.Named<Block> ANIMALS_SPAWNABLE_ON = bind("animals_spawnable_on");
   public static final Tag.Named<Block> AXOLOTLS_SPAWNABLE_ON = bind("axolotls_spawnable_on");
   public static final Tag.Named<Block> GOATS_SPAWNABLE_ON = bind("goats_spawnable_on");
   public static final Tag.Named<Block> MOOSHROOMS_SPAWNABLE_ON = bind("mooshrooms_spawnable_on");
   public static final Tag.Named<Block> PARROTS_SPAWNABLE_ON = bind("parrots_spawnable_on");
   public static final Tag.Named<Block> POLAR_BEARS_SPAWNABLE_ON_IN_FROZEN_OCEAN = bind("polar_bears_spawnable_on_in_frozen_ocean");
   public static final Tag.Named<Block> RABBITS_SPAWNABLE_ON = bind("rabbits_spawnable_on");
   public static final Tag.Named<Block> FOXES_SPAWNABLE_ON = bind("foxes_spawnable_on");
   public static final Tag.Named<Block> WOLVES_SPAWNABLE_ON = bind("wolves_spawnable_on");
   public static final Tag.Named<Block> AZALEA_GROWS_ON = bind("azalea_grows_on");
   public static final Tag.Named<Block> REPLACEABLE_PLANTS = bind("replaceable_plants");

   private BlockTags() {
   }

   public static Tag.Named<Block> bind(String pName) {
      return HELPER.bind(pName);
   }

   public static net.minecraftforge.common.Tags.IOptionalNamedTag<Block> createOptional(net.minecraft.resources.ResourceLocation name) {
       return createOptional(name, null);
   }

   public static net.minecraftforge.common.Tags.IOptionalNamedTag<Block> createOptional(net.minecraft.resources.ResourceLocation name, @javax.annotation.Nullable java.util.Set<java.util.function.Supplier<Block>> defaults) {
      return HELPER.createOptional(name, defaults);
   }

   public static TagCollection<Block> getAllTags() {
      return HELPER.getAllTags();
   }
}

package net.minecraft.world.entity.ai.behavior;

import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.Brain;
import net.minecraft.world.entity.ai.memory.MemoryModuleType;
import net.minecraft.world.entity.ai.memory.MemoryStatus;

public class CopyMemoryWithExpiry<E extends Mob, T> extends Behavior<E> {
   private final Predicate<E> predicate;
   private final MemoryModuleType<? extends T> sourceMemory;
   private final MemoryModuleType<T> targetMemory;
   private final UniformInt durationOfCopy;

   public CopyMemoryWithExpiry(Predicate<E> p_147456_, MemoryModuleType<? extends T> p_147457_, MemoryModuleType<T> p_147458_, UniformInt p_147459_) {
      super(ImmutableMap.of(p_147457_, MemoryStatus.VALUE_PRESENT, p_147458_, MemoryStatus.VALUE_ABSENT));
      this.predicate = p_147456_;
      this.sourceMemory = p_147457_;
      this.targetMemory = p_147458_;
      this.durationOfCopy = p_147459_;
   }

   protected boolean checkExtraStartConditions(ServerLevel pLevel, E pOwner) {
      return this.predicate.test(pOwner);
   }

   protected void start(ServerLevel pLevel, E pEntity, long pGameTime) {
      Brain<?> brain = pEntity.getBrain();
      brain.setMemoryWithExpiry(this.targetMemory, brain.getMemory(this.sourceMemory).get(), (long)this.durationOfCopy.sample(pLevel.random));
   }
}
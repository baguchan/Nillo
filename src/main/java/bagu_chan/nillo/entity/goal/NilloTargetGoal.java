package bagu_chan.nillo.entity.goal;

import bagu_chan.nillo.entity.Nillo;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;

import java.util.function.Predicate;

public class NilloTargetGoal <T extends LivingEntity> extends NearestAttackableTargetGoal<T> {
    private final Nillo tamableMob;

    public NilloTargetGoal(Nillo p_26097_, Class<T> p_26098_, boolean p_26099_, Predicate<LivingEntity> p_199894_) {
        super(p_26097_, p_26098_, p_26099_, p_199894_);
        this.tamableMob = p_26097_;
    }

    public boolean canUse() {
        return this.tamableMob.getHungerCooldown() <= 0 && !this.tamableMob.isTame() && super.canUse();
    }

    public boolean canContinueToUse() {
        return this.targetConditions != null ? this.targetConditions.test(this.mob, this.target) : super.canContinueToUse();
    }
}
package net.panam.Stands;

import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;

public class StandMain extends Mob {
    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState idleAnimationState2 = new AnimationState();
    public final AnimationState idleAnimationState3 = new AnimationState();
    public final AnimationState idleAnimationState4 = new AnimationState();
    public final AnimationState punchState1 = new AnimationState();
    public final AnimationState punchState2 = new AnimationState();
    public final AnimationState punchState3 = new AnimationState();
    public final AnimationState blockAnimationState = new AnimationState();
    public final AnimationState blockLoinAnimationState = new AnimationState();
    public final AnimationState barrageChargeAnimationState = new AnimationState();
    public final AnimationState barrageAnimationState = new AnimationState();
    public final AnimationState miningBarrageAnimationState = new AnimationState();
    public final AnimationState barrageEndAnimationState = new AnimationState();
    public final AnimationState barrageHurtAnimationState = new AnimationState();
    public final AnimationState brokenBlockAnimationState = new AnimationState();
    public final AnimationState standLeapAnimationState = new AnimationState();
    public final AnimationState standLeapEndAnimationState = new AnimationState();

    protected StandMain(EntityType<? extends Mob> p_21368_, Level p_21369_) {
        super(p_21368_, p_21369_);
    }
}

package net.panam.entidade.registros;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.panam.StandoPowa;
import net.panam.entidade.estand.ShockingBlue.shockbmain;

public class ModEntity {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, StandoPowa.MODID);

    public static final RegistryObject<EntityType<shockbmain>> SHOCKB =
            ENTITY_TYPES.register("shockingblue", () -> EntityType.Builder.of(shockbmain::new, MobCategory.CREATURE)
                    .sized(1.5f, 1.5f).build("shockingblue"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

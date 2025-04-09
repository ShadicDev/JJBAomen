package net.panam.entidade.estand.ShockingBlue.models;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.panam.StandoPowa;
import net.panam.entidade.estand.ShockingBlue.shockbmain;

public class shockbrenderer extends MobRenderer<shockbmain, ShockingB<shockbmain>> {
    public shockbrenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ShockingB<>(pContext.bakeLayer(ShockingB.LAYER_LOCATION)), 0.85f);
    }

    @Override
    public ResourceLocation getTextureLocation(shockbmain pEntity) {
        return ResourceLocation.fromNamespaceAndPath(StandoPowa.MODID, "textures/entity/stand/shockingb/shockingbluetexture.png");
    }

    @Override
    public void render(shockbmain pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if (pEntity.isBaby()) {
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            pPoseStack.scale(1f, 1f, 1f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}

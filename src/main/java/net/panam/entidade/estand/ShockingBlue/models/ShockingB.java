// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
package net.panam.entidade.estand.ShockingBlue.models;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.panam.StandoPowa;

public class ShockingB<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION =
			new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(StandoPowa.MODID, "shockingblue"), "main");
	private final ModelPart cuerpo;
	private final ModelPart cuerposup;
	private final ModelPart solocuerposup;
	private final ModelPart cape;
	private final ModelPart cape2;
	private final ModelPart cape3;
	private final ModelPart cape4;
	private final ModelPart brazoizquierdo;
	private final ModelPart brazoizqinf;
	private final ModelPart brazoderecho;
	private final ModelPart brazoderinf;
	private final ModelPart cabeza;
	private final ModelPart cuerpoinf;
	private final ModelPart piernas;
	private final ModelPart piernaderecha;
	private final ModelPart piernaderechainf;
	private final ModelPart piernaizquierda;
	private final ModelPart piernaizquierdainf;
	private final ModelPart barrage;
	private final ModelPart barrageizquierda3;
	private final ModelPart barrageizquierda2;
	private final ModelPart barrageizquierda;
	private final ModelPart barragederecha1;
	private final ModelPart barragederecha2;
	private final ModelPart barragederecha3;

	public ShockingB(ModelPart root) {
		this.cuerpo = root.getChild("cuerpo");
		this.cuerposup = this.cuerpo.getChild("cuerposup");
		this.solocuerposup = this.cuerposup.getChild("solocuerposup");
		this.cape = this.solocuerposup.getChild("cape");
		this.cape2 = this.cape.getChild("cape2");
		this.cape3 = this.cape2.getChild("cape3");
		this.cape4 = this.cape3.getChild("cape4");
		this.brazoizquierdo = this.solocuerposup.getChild("brazoizquierdo");
		this.brazoizqinf = this.brazoizquierdo.getChild("brazoizqinf");
		this.brazoderecho = this.solocuerposup.getChild("brazoderecho");
		this.brazoderinf = this.brazoderecho.getChild("brazoderinf");
		this.cabeza = this.solocuerposup.getChild("cabeza");
		this.cuerpoinf = this.cuerposup.getChild("cuerpoinf");
		this.piernas = this.cuerpo.getChild("piernas");
		this.piernaderecha = this.piernas.getChild("piernaderecha");
		this.piernaderechainf = this.piernaderecha.getChild("piernaderechainf");
		this.piernaizquierda = this.piernas.getChild("piernaizquierda");
		this.piernaizquierdainf = this.piernaizquierda.getChild("piernaizquierdainf");
		this.barrage = root.getChild("barrage");
		this.barrageizquierda3 = this.barrage.getChild("barrageizquierda3");
		this.barrageizquierda2 = this.barrage.getChild("barrageizquierda2");
		this.barrageizquierda = this.barrage.getChild("barrageizquierda");
		this.barragederecha1 = this.barrage.getChild("barragederecha1");
		this.barragederecha2 = this.barrage.getChild("barragederecha2");
		this.barragederecha3 = this.barrage.getChild("barragederecha3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition cuerpo = partdefinition.addOrReplaceChild("cuerpo", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cuerposup = cuerpo.addOrReplaceChild("cuerposup", CubeListBuilder.create(), PartPose.offset(0.0F, 19.0F, 0.0F));

		PartDefinition solocuerposup = cuerposup.addOrReplaceChild("solocuerposup", CubeListBuilder.create().texOffs(33, 11).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(33, 23).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(33, 0).addBox(-4.0F, 3.0F, -3.0F, 8.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition cape = solocuerposup.addOrReplaceChild("cape", CubeListBuilder.create(), PartPose.offset(0.0F, 4.425F, 1.775F));

		PartDefinition cape_r1 = cape.addOrReplaceChild("cape_r1", CubeListBuilder.create().texOffs(0, 69).addBox(-5.0F, -3.8458F, -0.9902F, 10.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.025F, 0.45F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cape2 = cape.addOrReplaceChild("cape2", CubeListBuilder.create(), PartPose.offset(0.0F, -1.7655F, 0.5696F));

		PartDefinition cape2_r1 = cape2.addOrReplaceChild("cape2_r1", CubeListBuilder.create().texOffs(0, 69).addBox(-7.0F, -11.8458F, -0.9902F, 14.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8855F, -0.5978F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cape3 = cape2.addOrReplaceChild("cape3", CubeListBuilder.create(), PartPose.offset(0.0F, -4.961F, 0.0491F));

		PartDefinition cape3_r1 = cape3.addOrReplaceChild("cape3_r1", CubeListBuilder.create().texOffs(0, 69).addBox(-7.0F, -4.8458F, -0.9902F, 14.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1073F, 1.0861F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cape4 = cape3.addOrReplaceChild("cape4", CubeListBuilder.create(), PartPose.offset(0.0F, -5.6549F, 1.6073F));

		PartDefinition cape3_r2 = cape4.addOrReplaceChild("cape3_r2", CubeListBuilder.create().texOffs(0, 69).addBox(-7.0F, -4.8458F, -2.4402F, 14.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4524F, 1.4788F, 0.1309F, 0.0F, 0.0F));

		PartDefinition brazoizquierdo = solocuerposup.addOrReplaceChild("brazoizquierdo", CubeListBuilder.create().texOffs(51, 47).addBox(0.0F, -6.5F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(17, 46).addBox(0.0F, -6.5F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offset(4.0F, 5.5F, 0.0F));

		PartDefinition brazoizqinf = brazoizquierdo.addOrReplaceChild("brazoizqinf", CubeListBuilder.create().texOffs(58, 11).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(51, 59).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(98, 106).addBox(-2.0F, -5.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(2.0F, -6.5F, 0.0F));

		PartDefinition brazoderecho = solocuerposup.addOrReplaceChild("brazoderecho", CubeListBuilder.create().texOffs(0, 57).addBox(-3.0F, -6.5F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(0, 45).addBox(-3.0F, -6.5F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 5.5F, 0.0F));

		PartDefinition brazoderinf = brazoderecho.addOrReplaceChild("brazoderinf", CubeListBuilder.create().texOffs(62, 0).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(98, 106).addBox(-2.0F, -5.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.2F))
		.texOffs(17, 58).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -6.5F, 0.0F));

		PartDefinition cabeza = solocuerposup.addOrReplaceChild("cabeza", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 17).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.1F))
		.texOffs(100, 105).addBox(4.0F, -1.0F, -2.0F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.2F))
		.texOffs(99, 105).addBox(-4.0F, -1.0F, -2.0F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.2F))
		.texOffs(51, 121).addBox(4.0F, 1.0F, -1.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(51, 121).addBox(-6.0F, 1.0F, -1.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(54, 124).addBox(6.0F, 2.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(54, 124).addBox(-7.0F, 2.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(54, 124).addBox(6.0F, 2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(54, 124).addBox(-7.0F, 2.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition cube_r1 = cabeza.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(98, 102).addBox(-1.0F, 0.0F, -2.0F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(2.0F, -1.0F, 5.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cuerpoinf = cuerposup.addOrReplaceChild("cuerpoinf", CubeListBuilder.create().texOffs(25, 35).addBox(-4.0F, -3.0F, -2.0F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(0, 34).addBox(-4.0F, -3.0F, -2.0F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition piernas = cuerpo.addOrReplaceChild("piernas", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition piernaderecha = piernas.addOrReplaceChild("piernaderecha", CubeListBuilder.create().texOffs(112, 79).addBox(-2.0F, -6.5F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(34, 46).addBox(-2.0F, -6.5F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 12.5F, 0.0F));

		PartDefinition piernaderechainf = piernaderecha.addOrReplaceChild("piernaderechainf", CubeListBuilder.create().texOffs(68, 33).addBox(-2.0F, -5.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(58, 22).addBox(-2.0F, -5.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.5F, 0.0F));

		PartDefinition piernaizquierda = piernas.addOrReplaceChild("piernaizquierda", CubeListBuilder.create().texOffs(51, 35).addBox(-2.0F, -6.5F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(112, 64).addBox(-2.0F, -6.5F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offset(2.0F, 12.5F, 0.0F));

		PartDefinition piernaizquierdainf = piernaizquierda.addOrReplaceChild("piernaizquierdainf", CubeListBuilder.create().texOffs(-4, -2).addBox(-2.0F, -5.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(34, 58).addBox(-2.0F, -5.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.5F, 0.0F));

		PartDefinition barrage = partdefinition.addOrReplaceChild("barrage", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition barrageizquierda3 = barrage.addOrReplaceChild("barrageizquierda3", CubeListBuilder.create().texOffs(58, 11).addBox(-1.9248F, -4.125F, -2.062F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(51, 59).addBox(-1.9248F, -4.125F, -2.062F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(98, 106).addBox(-1.9248F, -3.125F, -2.062F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(11.9248F, 10.938F, 1.125F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r2 = barrageizquierda3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(22, 119).addBox(-2.0F, -2.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2257F, 3.875F, 0.186F, -1.5708F, 0.0F, -0.1309F));

		PartDefinition barrageizquierda2 = barrage.addOrReplaceChild("barrageizquierda2", CubeListBuilder.create().texOffs(58, 11).addBox(-1.9511F, -4.2468F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(51, 59).addBox(-1.9511F, -4.2468F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(98, 106).addBox(-1.9511F, -3.2468F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(11.9511F, 27.0F, 1.2468F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r3 = barrageizquierda2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(22, 119).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0489F, 2.7532F, 2.0F, 1.5708F, 0.0F, -0.1309F));

		PartDefinition barrageizquierda = barrage.addOrReplaceChild("barrageizquierda", CubeListBuilder.create().texOffs(58, 11).addBox(-1.9532F, -4.2142F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(51, 59).addBox(-1.9532F, -4.2142F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(98, 106).addBox(-1.9532F, -3.2142F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(11.9532F, 19.0F, 1.2142F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r4 = barrageizquierda.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 119).addBox(-3.0F, 0.0F, -1.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0468F, 2.7858F, 2.0F, 1.5708F, 0.0F, -0.1309F));

		PartDefinition barragederecha1 = barrage.addOrReplaceChild("barragederecha1", CubeListBuilder.create().texOffs(62, 0).addBox(-2.0794F, -4.212F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(98, 106).addBox(-2.0794F, -3.212F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.2F))
		.texOffs(17, 58).addBox(-2.0794F, -4.212F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.9206F, 11.0F, 1.212F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r5 = barragederecha1.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 119).addBox(-1.0F, 0.0F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0794F, 1.788F, -1.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition barragederecha2 = barrage.addOrReplaceChild("barragederecha2", CubeListBuilder.create().texOffs(62, 0).addBox(-2.0794F, -4.212F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(98, 106).addBox(-2.0794F, -3.212F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.2F))
		.texOffs(17, 58).addBox(-2.0794F, -4.212F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.9206F, 19.0F, 1.212F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r6 = barragederecha2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 119).addBox(-1.0F, 0.0F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0794F, 1.788F, -1.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition barragederecha3 = barrage.addOrReplaceChild("barragederecha3", CubeListBuilder.create().texOffs(62, 0).addBox(-2.0794F, -4.212F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.1F))
		.texOffs(98, 106).addBox(-2.0794F, -3.212F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.2F))
		.texOffs(17, 58).addBox(-2.0794F, -4.212F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.9206F, 27.0F, 2.212F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r7 = barragederecha3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 119).addBox(-1.0F, 0.0F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0794F, 1.788F, -1.0F, 0.0F, 0.0F, 0.1309F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		cuerpo.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}
}
// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelScaleHelmet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "modelscalehelmet"), "main");
	private final ModelPart head;

	public ModelScaleHelmet(ModelPart root) {
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).mirror()
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 16)
				.mirror().addBox(-5.0F, -9.0F, -5.0F, 10.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 0).mirror().addBox(-6.0F, -7.0F, -2.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(4, 20).mirror()
				.addBox(-7.0F, -8.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 2)
				.mirror().addBox(-9.0F, -9.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(4, 4).mirror().addBox(-8.0F, -8.0F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(2, 2).mirror()
				.addBox(-9.0F, -7.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 0)
				.mirror().addBox(5.0F, -7.0F, -2.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(4, 20).mirror().addBox(6.0F, -8.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(4, 4).mirror()
				.addBox(7.0F, -8.0F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 2)
				.mirror().addBox(7.0F, -9.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(2, 2).mirror().addBox(7.0F, -7.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
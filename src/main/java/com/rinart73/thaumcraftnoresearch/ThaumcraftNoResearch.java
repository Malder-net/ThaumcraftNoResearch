package com.rinart73.thaumcraftnoresearch;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import thaumcraft.api.capabilities.IPlayerKnowledge;
import thaumcraft.api.capabilities.ThaumcraftCapabilities;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchCategory;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSTION, acceptedMinecraftVersions = Reference.ACCEPTED_MINECRAFT_VERSIONS, dependencies = Reference.MOD_DEPS)
@Mod.EventBusSubscriber
public class ThaumcraftNoResearch {

    @SubscribeEvent
    public static void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
        if(event.player instanceof EntityPlayerMP) {
            EntityPlayerMP player = (EntityPlayerMP) event.player;

            IPlayerKnowledge knowledge = ThaumcraftCapabilities.getKnowledge(player);
            ResearchCategory researchBasics = ResearchCategories.getResearchCategory("BASICS");

            int value = knowledge.getKnowledgeRaw(IPlayerKnowledge.EnumKnowledgeType.THEORY, researchBasics);
            if (value < 1600) {
                ResearchCategory researchAuromancy = ResearchCategories.getResearchCategory("AUROMANCY"),
                        researchAlchemy = ResearchCategories.getResearchCategory("ALCHEMY"),
                        researchArtifice = ResearchCategories.getResearchCategory("ARTIFICE"),
                        researchInfusion = ResearchCategories.getResearchCategory("INFUSION"),
                        researchGolemancy = ResearchCategories.getResearchCategory("GOLEMANCY"),
                        researchEldritch = ResearchCategories.getResearchCategory("ELDRITCH");

                knowledge.addKnowledge(IPlayerKnowledge.EnumKnowledgeType.THEORY, researchBasics, Math.max(0, 1600 - value));
                value = knowledge.getKnowledgeRaw(IPlayerKnowledge.EnumKnowledgeType.THEORY, researchAuromancy);
                knowledge.addKnowledge(IPlayerKnowledge.EnumKnowledgeType.THEORY, researchAuromancy, Math.max(0, 1600 - value));
                value = knowledge.getKnowledgeRaw(IPlayerKnowledge.EnumKnowledgeType.THEORY, researchAlchemy);
                knowledge.addKnowledge(IPlayerKnowledge.EnumKnowledgeType.THEORY, researchAlchemy, Math.max(0, 1600 - value));
                value = knowledge.getKnowledgeRaw(IPlayerKnowledge.EnumKnowledgeType.THEORY, researchArtifice);
                knowledge.addKnowledge(IPlayerKnowledge.EnumKnowledgeType.THEORY, researchArtifice, Math.max(0, 1600 - value));
                value = knowledge.getKnowledgeRaw(IPlayerKnowledge.EnumKnowledgeType.THEORY, researchInfusion);
                knowledge.addKnowledge(IPlayerKnowledge.EnumKnowledgeType.THEORY, researchInfusion, Math.max(0, 1600 - value));
                value = knowledge.getKnowledgeRaw(IPlayerKnowledge.EnumKnowledgeType.THEORY, researchGolemancy);
                knowledge.addKnowledge(IPlayerKnowledge.EnumKnowledgeType.THEORY, researchGolemancy, Math.max(0, 1600 - value));
                value = knowledge.getKnowledgeRaw(IPlayerKnowledge.EnumKnowledgeType.THEORY, researchEldritch);
                knowledge.addKnowledge(IPlayerKnowledge.EnumKnowledgeType.THEORY, researchEldritch, Math.max(0, 1600 - value));

                value = knowledge.getKnowledgeRaw(IPlayerKnowledge.EnumKnowledgeType.OBSERVATION, researchBasics);
                knowledge.addKnowledge(IPlayerKnowledge.EnumKnowledgeType.OBSERVATION, researchBasics, Math.max(0, 3200 - value));
                value = knowledge.getKnowledgeRaw(IPlayerKnowledge.EnumKnowledgeType.OBSERVATION, researchAuromancy);
                knowledge.addKnowledge(IPlayerKnowledge.EnumKnowledgeType.OBSERVATION, researchAuromancy, Math.max(0, 3200 - value));
                value = knowledge.getKnowledgeRaw(IPlayerKnowledge.EnumKnowledgeType.OBSERVATION, researchAlchemy);
                knowledge.addKnowledge(IPlayerKnowledge.EnumKnowledgeType.OBSERVATION, researchAlchemy, Math.max(0, 3200 - value));
                value = knowledge.getKnowledgeRaw(IPlayerKnowledge.EnumKnowledgeType.OBSERVATION, researchArtifice);
                knowledge.addKnowledge(IPlayerKnowledge.EnumKnowledgeType.OBSERVATION, researchArtifice, Math.max(0, 3200 - value));
                value = knowledge.getKnowledgeRaw(IPlayerKnowledge.EnumKnowledgeType.OBSERVATION, researchInfusion);
                knowledge.addKnowledge(IPlayerKnowledge.EnumKnowledgeType.OBSERVATION, researchInfusion, Math.max(0, 3200 - value));
                value = knowledge.getKnowledgeRaw(IPlayerKnowledge.EnumKnowledgeType.OBSERVATION, researchGolemancy);
                knowledge.addKnowledge(IPlayerKnowledge.EnumKnowledgeType.OBSERVATION, researchGolemancy, Math.max(0, 3200 - value));
                value = knowledge.getKnowledgeRaw(IPlayerKnowledge.EnumKnowledgeType.OBSERVATION, researchEldritch);
                knowledge.addKnowledge(IPlayerKnowledge.EnumKnowledgeType.OBSERVATION, researchEldritch, Math.max(0, 3200 - value));
            }
        }
    }

}

package net.panam.eventos;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.panam.entidade.estand.ShockingBlue.models.ShockingB;

import java.util.WeakHashMap;

public class EventHandler {
    private static final WeakHashMap<Player, Mob> PLAYER_COMPANIONS = new WeakHashMap<>();
    private static final double FOLLOW_DISTANCE = 1.5; // Distancia al jugador
    private static final float HEIGHT_OFFSET = 0.0f; // Ajuste de altura

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.START || event.side.isClient()) return;

        Player player = event.player;
        Level level = player.level();

        // Obtener o crear el mob compañero
        Mob companion = PLAYER_COMPANIONS.computeIfAbsent(player, p -> {
            Mob mob = new ShockingB<>
            mob.setInvulnerable(true);
            mob.setNoAi(true); // Desactivar IA
            mob.setPersistenceRequired();
            level.addFreshEntity(mob);
            return mob;
        });

        // Actualizar posición
        updateCompanionPosition(player, companion);
    }

    private static void updateCompanionPosition(Player player, Mob companion) {
        // Calcular posición relativa
        Vec3 lookVec = player.getLookAngle();
        Vec3 sideOffset = new Vec3(-lookVec.z, 0, lookVec.x).normalize();

        Vec3 targetPos = player.position()
                .add(sideOffset.scale(FOLLOW_DISTANCE))
                .add(0, HEIGHT_OFFSET, 0);

        // Mover suavemente
        companion.setDeltaMovement(Vec3.ZERO);
        companion.moveTo(
                targetPos.x,
                targetPos.y,
                targetPos.z,
                player.getYRot(),
                player.getXRot()
        );
    }
}

package io.github.FlagFan34272.bsys.listeners

import io.github.FlagFan34272.bsys.ByeongSinCore.Companion.plugin
import net.kyori.adventure.text.Component.text
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class JoinEvent: Listener {
    @EventHandler
    fun PlayerJoinEvent.onJoin() {
        Bukkit.getScheduler().runTaskTimer(plugin, Runnable {
            PotionEffectType.values().forEach { potionEffectType ->
                player.addPotionEffect(PotionEffect(potionEffectType, 20, 1))
                //player.sendMessage(text("${potionEffectType.name} 포션 이펙트를 추가했습니다!", NamedTextColor.GREEN))
            }
        },0L,1L)
    }
}

package io.github.FlagFan34272.bsys

import io.github.FlagFan34272.bsys.listeners.JoinEvent
import org.bukkit.plugin.java.JavaPlugin

class ByeongSinCore: JavaPlugin() {
    companion object {
        lateinit var plugin: ByeongSinCore
            private set
    }
    override fun onEnable() {
        plugin = this
        server.pluginManager.registerEvents(JoinEvent(), this)
    }
}
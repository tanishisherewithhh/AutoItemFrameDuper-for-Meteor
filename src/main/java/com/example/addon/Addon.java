package com.example.addon;

import com.example.addon.commands.CommandExample;
import com.example.addon.hud.HudExample;
import com.example.addon.modules.ItemFrameDupe;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.commands.Commands;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

import java.lang.invoke.MethodHandles;

public class Addon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("Duper");
    public static final HudGroup HUD_GROUP = new HudGroup("Item Frame Duper");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Meteor Addon ItemFrameDuper");
        // Modules
        Modules.get().add(new ItemFrameDupe());

        // Commands
        Commands.get().add(new CommandExample());

        // HUD
        Hud.get().register(HudExample.INFO);
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.example.addon";
    }
}

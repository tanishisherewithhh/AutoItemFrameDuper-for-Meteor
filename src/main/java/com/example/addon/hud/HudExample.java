package com.example.addon.hud;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.render.color.Color;
import org.jetbrains.annotations.NotNull;

public class HudExample extends HudElement {
    public static final HudElementInfo<HudExample> INFO = new HudElementInfo<>(Addon.HUD_GROUP, "Duper", "HUD element Duper.", HudExample::new);

    public HudExample() {
        super(INFO);
    }

    @Override
    public void render(@NotNull HudRenderer renderer) {
        setSize(renderer.textWidth("Item Frame Duper", true), renderer.textHeight(true));

        renderer.text("Duper for ItemFrame dupe", x, y, Color.WHITE, true);
    }
}

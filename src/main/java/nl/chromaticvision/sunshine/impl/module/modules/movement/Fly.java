package nl.chromaticvision.sunshine.impl.module.modules.movement;

import nl.chromaticvision.sunshine.impl.module.Category;
import nl.chromaticvision.sunshine.impl.module.Module;

public class Fly extends Module {

    public Fly() {
        super("Fly", Category.MOVEMENT);
    }

    @Override
    public void onEnable() {
        super.onEnable();

        mc.player.capabilities.allowFlying = true;
    }

    @Override
    public void onDisable() {
        super.onDisable();

        mc.player.capabilities.allowFlying = false;
    }
}
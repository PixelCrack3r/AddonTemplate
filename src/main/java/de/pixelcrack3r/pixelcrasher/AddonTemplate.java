package de.pixelcrack3r.pixelcrasher;

import de.pixelcrasher.plugin.java.PixelCrasherAddon;

public class AddonTemplate extends PixelCrasherAddon {

    @Override
    public void onEnable() {
        this.getLogger().info("Hello, world!");
    }
}

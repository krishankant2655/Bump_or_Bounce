package Bump_or_Bounce;

import java.awt.*;

/**
 * Created by cerebro on 06/07/18.
 */
public final class WelcomeScreenResources extends Resources {

    private static Image logoImage;

    private WelcomeScreenResources() {
    }

    public static void load() {
        if(!Resources.isLoaded()) {
            Resources.load();
        }

//        logoImage = ImageIO.read()
        // load extra images.
    }

    public static Image getLogoImage() {
        return logoImage;
    }
}

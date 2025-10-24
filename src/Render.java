/**
 * Renderer interface represents rendering implementations. This is the
 * implementation side of a potential Bridge: media playback can delegate
 * rendering to a Renderer so the rendering implementation can vary at runtime.
 */
interface Renderer {
    void render(Media media);
}

class SoftwareRenderer implements Renderer {
    @Override
    public void render(Media media) {
        System.out.println("[SoftwareRenderer] Rendering: " + media.getName() + " (software)");
    }
}

class HardwareRenderer implements Renderer {
    @Override
    public void render(Media media) {
        System.out.println("[HardwareRenderer] Rendering: " + media.getName() + " (hardware acceleration)");
    }
}
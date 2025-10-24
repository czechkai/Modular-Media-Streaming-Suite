abstract class MediaDecorator implements Media {
    protected Media wrapped;

    public MediaDecorator(Media wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getName() {
        return wrapped.getName();
    }

    @Override
    public void play() {
       
        wrapped.play();
    }
}

class SubtitleDecorator extends MediaDecorator {
    private String language;

    public SubtitleDecorator(Media wrapped, String language) {
        super(wrapped);
        this.language = language;
    }

    @Override
    public void play() {
        System.out.println("[Subtitle] Loading subtitles (" + language + ") for: " + getName());
        super.play();
    }
}

class WatermarkDecorator extends MediaDecorator {
    private String watermarkText;

    public WatermarkDecorator(Media wrapped, String watermarkText) {
        super(wrapped);
        this.watermarkText = watermarkText;
    }

    @Override
    public void play() {
        System.out.println("[Watermark] Applying watermark '" + watermarkText + "' to: " + getName());
        super.play();
    }
}

class EqualizerDecorator extends MediaDecorator {
    private String profile;

    public EqualizerDecorator(Media wrapped, String profile) {
        super(wrapped);
        this.profile = profile;
    }

    @Override
    public void play() {
        System.out.println("[Equalizer] Applying profile '" + profile + "' to: " + getName());
        super.play();
    }
}


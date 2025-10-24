# Design Rationale

The **Modular Media Streaming Suite** is a simple Java console program that plays media from different sources and can add effects like subtitles, watermark, and equalizer.  
It was made to show how structural design patterns can make code easier to extend, manage, and reuse.

## Why Use Design Patterns
1. **Decorator Pattern**
   - Used to add extra features (like subtitles, watermark, or equalizer) while the program is running.
   - This lets us “decorate” a media file without changing the main class.

2. **Composite Pattern**
   - Used in the `Playlist` class to allow multiple media files to be grouped together.
   - The player can play one file or a whole playlist using the same method.

3. **Proxy Pattern**
   - Used to handle caching when loading remote media.
   - The `ProxySource` checks if a media file is already loaded before downloading again.

4. **Simple and Modular Design**
   - Each class has one job (like loading, rendering, or decorating).
   - Easy to add more sources or plugins later without changing other parts of the code.



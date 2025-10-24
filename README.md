**Modular Media Streaming Suite**
  A Java console app that simulates a simple media player with add-on features.
  It uses design patterns like Decorator, Composite, and Proxy to make the system modular and flexible.

**Features:**
  - Play media from local or remote sources
  - Create and play playlists
  - Add extra features:
      - Subtitles
      - Watermark
      - Equalizer
  - Switch between software and hardware rendering
  - Cache remote media using a proxy

**Design Patterns:**
  -**Decorator**
      Add plugins like subtitles and watermark while running.
  -**Composite**
      Handle single media or whole playlists the same way.
  -**"Proxy**
      Cache remote media to improve speed.

file_structure: |
  /ModularMediaStreamingSuite
  │
  ├── Main.java
  ├── MediaPlayer.java
  ├── MediaSource.java
  ├── Playlist.java
  ├── Plugins.java
  ├── Render.java
  └── README.md

**How to run:**
  **Step 1:**
    Clone from GitHub
    commands: |
      git clone https://github.com/<your-username>/ModularMediaStreamingSuite.git
      cd ModularMediaStreamingSuite
      
  **Step 2**
    Open in VS Code
    instructions:
      - Open VS Code.
      - Go to **File → Open Folder...** and select the cloned project.
      - Open the terminal in VS Code (Ctrl + `).
      
  **Step 3**
    Compile the Code
    command: javac *.java
    
  **Step 4**
    title: "Run the Program"
    command: java Main
    
    console_output: |
      Welcome to Modular Media Streaming Suite
      ----------------------------------------
      Choose source: Local, Remote, or Playlist
      Add plugin: Subtitles, Watermark, Equalizer
      Select render: Hardware or Software
      Playing media...
      Playback complete!

  This project was made for a Java lab to practice structural design patterns in a clear and simple way.
  It can be extended with more media features or plugins in the future.




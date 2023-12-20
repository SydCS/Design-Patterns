package com.structural.bridge2;

public abstract class MediaPlayer {
    public DeviceImp deviceImp;

    public MediaPlayer(DeviceImp deviceImp) {
        this.deviceImp = deviceImp;
    }

    public void play(String fileName) {

    }
}

class AudioPlayer extends MediaPlayer {
    public AudioPlayer(DeviceImp deviceImp) {
        super(deviceImp);
    }
}

class VideoPlayer extends MediaPlayer {
    public VideoPlayer(DeviceImp deviceImp) {
        super(deviceImp);
    }
}
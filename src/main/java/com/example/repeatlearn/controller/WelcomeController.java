package com.example.repeatlearn.controller;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.IOException;

public class WelcomeController {

    @FXML
    private MediaView main_mediaView;
    private MediaPlayer mediaPlayer;

    String url = "/com/example/repeatlearn/videos/video.mp4";

    public void initialize() throws InterruptedException {
        mediaPlayer = new MediaPlayer(new Media(this.getClass().getResource(url).toExternalForm()));
        mediaPlayer.setAutoPlay(true);
        main_mediaView.setMediaPlayer(mediaPlayer);
    }

}

package com.example.repeatlearn.controller;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class WelcomeController {

    @FXML
    private MediaView main_mediaView;
    private MediaPlayer mediaPlayer;

    String url = "/com/example/repeatlearn/video.mp4";

    public void initialize(){
        mediaPlayer = new MediaPlayer(new Media(this.getClass().getResource(url).toExternalForm()));
        mediaPlayer.setAutoPlay(true);
        main_mediaView.setMediaPlayer(mediaPlayer);
    }
    class thread extends Thread{

        @Override
        public void run(){

        }
    }
}

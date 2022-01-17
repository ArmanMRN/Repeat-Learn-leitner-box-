package com.example.repeatlearn.model;

public class Word {

    private int id;
    private String word;
    private String meaning;
    private int repeat_level;
    private long entered_time;
    private long next_repeat_time;
    private boolean is_finished;

    public Word(int id, String word, String meaning, int level, long entered_time, long next_repeat_time, boolean is_finished) {
        this.id = id;
        this.word = word;
        this.meaning = meaning;
        this.repeat_level = level;
        this.entered_time = entered_time;
        this.next_repeat_time = next_repeat_time;
        this.is_finished = is_finished;
    }

    public Word(String word, String meaning, int level, long entered_time, long next_repeat_time, boolean is_finished) {
        this.word = word;
        this.meaning = meaning;
        this.repeat_level = level;
        this.entered_time = entered_time;
        this.next_repeat_time = next_repeat_time;
        this.is_finished = is_finished;
    }

    public Word() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public int getRepeat_level() {
        return repeat_level;
    }

    public void setRepeat_level(int level) {
        this.repeat_level = level;
    }

    public long getEntered_time() {
        return entered_time;
    }

    public void setEntered_time(long entered_time) {
        this.entered_time = entered_time;
    }

    public long getNext_repeat_time() {
        return next_repeat_time;
    }

    public void setNext_repeat_time(long next_repeat_time) {
        this.next_repeat_time = next_repeat_time;
    }

    public boolean isIs_finished() {
        return is_finished;
    }

    public void setIs_finished(boolean is_finished) {
        this.is_finished = is_finished;
    }

    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", meaning='" + meaning + '\'' +
                ", level=" + repeat_level +
                ", entered_time=" + entered_time +
                ", next_repeat_time=" + next_repeat_time +
                ", is_finished=" + is_finished +
                '}';
    }
}

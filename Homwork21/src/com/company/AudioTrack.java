package com.company;

public class AudioTrack implements Comparable<AudioTrack> {
    int duration;
    String title;
    String author;

    @Override
    public int compareTo(AudioTrack o) {
        return duration - o.duration;
    }
}

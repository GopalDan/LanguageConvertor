package com.example.gopal.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    /*
    Listener gets triggered when media player gets completed playing audio file
     */
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        setTitle("FamilyMembers");

        String selectedLanguage = "";
        final ArrayList<Word> familyList;
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            selectedLanguage = bundle.getString(MainActivity.LANGUAGE_KEY, MainActivity.BENGALI);
        }
        if (selectedLanguage.equals(MainActivity.BENGALI)) {
            familyList = Utility.getFamilyListForBengali();

        } else {
            familyList = Utility.getFamilyListForHindi();

        }

        WordAdapter adapter = new WordAdapter(this, familyList, R.color.family_catagory_color);
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word currentWord = familyList.get(i);

                releaseMediaPlayer();

                mMediaPlayer = MediaPlayer.create(FamilyActivity.this, currentWord.getmSongResourceId());
                mMediaPlayer.start();

                //Releasing mediaplayer on completion
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }


        });
    }


    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }
}

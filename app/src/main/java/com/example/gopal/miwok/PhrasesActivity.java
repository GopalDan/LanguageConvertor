package com.example.gopal.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        setTitle("Phrases");
        String selectedLanguage = "";
        final ArrayList<Word> phraseList;
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            selectedLanguage = bundle.getString(MainActivity.LANGUAGE_KEY, MainActivity.BENGALI);
        }
        if (selectedLanguage.equals(MainActivity.BENGALI)) {
            phraseList = Utility.getPhrasesListForBengali();

        } else {
            phraseList = Utility.getPhrasesListForHindi();

        }
        WordAdapter adapter = new WordAdapter(this, phraseList,R.color.phrase_catagory_color);
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word currentWord = phraseList.get(i);
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this,currentWord.getmSongResourceId());
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mMediaPlayer.release();
                   }
                });
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mMediaPlayer!=null){
            mMediaPlayer.release();
            mMediaPlayer = null;

        }
    }

}

package com.example.frenchteacher;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button blackBtn, yellowBtn, purpleBtn, redBtn, greenBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackBtn = findViewById(R.id.blackBtn);
        redBtn = findViewById(R.id.redBtn);
        greenBtn = findViewById(R.id.greenBtn);
        yellowBtn = findViewById(R.id.yellowBtn);
        purpleBtn = findViewById(R.id.purpleBtn);

        redBtn.setOnClickListener(this);
        blackBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        // we find the button by id and play the correct sound

        int clickedBtnId = v.getId();

        if (clickedBtnId == R.id.redBtn) {
            playSounds(R.raw.red);
        }
        else if(clickedBtnId == R.id.yellowBtn) {
            playSounds(R.raw.yellow);
        }
        else if(clickedBtnId == R.id.purpleBtn) {
            playSounds(R.raw.purple);
        }
        else if(clickedBtnId == R.id.greenBtn) {
            playSounds(R.raw.green);
        }
        else if(clickedBtnId == R.id.blackBtn) {
            playSounds(R.raw.black);
        }


    }
    public void playSounds(int id){
        MediaPlayer mediaplayer = MediaPlayer.create(
                this,
                id
        );

        mediaplayer.start();
    }
}

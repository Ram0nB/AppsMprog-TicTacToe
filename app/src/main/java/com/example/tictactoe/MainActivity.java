package com.example.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new Game();
    }

    public void tileClicked(View view) {
        int id = view.getId();
        int row = 0;
        int column = 0;
        Button button = findViewById(R.id.button00);
        switch (id) {
            case R.id.button00 :
                button = findViewById(R.id.button00);
                row = 0;
                column = 0;
                break;
            case R.id.button01 :
                button = findViewById(R.id.button01);
                row = 0;
                column = 1;
                break;
            case R.id.button02 :
                button = findViewById(R.id.button02);
                row = 0;
                column = 2;
                break;
            case R.id.button10 :
                button = findViewById(R.id.button10);
                row = 1;
                column = 0;
                break;
            case R.id.button11 :
                button = findViewById(R.id.button11);
                row = 1;
                column = 1;
                break;
            case R.id.button12 :
                button = findViewById(R.id.button12);
                row = 1;
                column = 2;
                break;
            case R.id.button20 :
                button = findViewById(R.id.button20);
                row = 2;
                column = 0;
                break;
            case R.id.button21 :
                button = findViewById(R.id.button21);
                row = 2;
                column = 1;
                break;
            case R.id.button22 :
                button = findViewById(R.id.button22);
                row = 2;
                column = 2;
                break;
        }

        TileState state = game.choose(row, column);
        switch(state) {
            case CROSS:
                button.setText("X");
                break;
            case CIRCLE:
                button.setText("0");
                break;
            case INVALID:
                // TODO: do something different
                break;
        }

    }

    public void resetClicked(View view) {
        game = new Game();

        Button button00 = findViewById(R.id.button00);
        Button button01 = findViewById(R.id.button01);
        Button button02 = findViewById(R.id.button02);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);
        Button button20 = findViewById(R.id.button20);
        Button button21 = findViewById(R.id.button21);
        Button button22 = findViewById(R.id.button22);

        button00.setText("");
        button01.setText("");
        button02.setText("");
        button10.setText("");
        button11.setText("");
        button12.setText("");
        button20.setText("");
        button21.setText("");
        button22.setText("");

    }

}

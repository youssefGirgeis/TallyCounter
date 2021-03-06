package com.example.tallycounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int tally;
    private TextView tallyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tally = 0;

        Button tallyButton = (Button)findViewById(R.id.TallyButton);
        tallyButton.setOnClickListener(onClickTallyButton);

        Button resetButton = (Button)findViewById(R.id.resetButton);
        resetButton.setOnClickListener(onClickResetButton);

        tallyTextView = (TextView)findViewById(R.id.TallyText);

    }

    private View.OnClickListener onClickTallyButton = new View.OnClickListener(){


        @Override
        public void onClick(View view) {
            tally++;
            //System.out.println(tally);
            tallyTextView.setText(String.valueOf(tally));
        }
    };

    private View.OnClickListener onClickResetButton = new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            tally = 0;
            tallyTextView.setText(String.valueOf(tally));
        }
    };
}

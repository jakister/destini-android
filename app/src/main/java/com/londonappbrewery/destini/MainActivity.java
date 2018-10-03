package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mButtonTop;
    Button mButtonBottom;
    TextView mStoryTextView;
    int mIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);


        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update(true);
            }
        });


        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update(false);
            }
        });

        mIndex = 0;
        update(false);

    }

    private void update(boolean topButtonClicked) {
        switch (mIndex) {
            case 0:
                updateStoryAndButtonsTextViews(mIndex = 1);
                break;
            case 1:
                if (topButtonClicked) {
                    updateStoryAndButtonsTextViews(mIndex = 2);
                } else {
                    updateStoryAndButtonsTextViews(mIndex = 3);
                }
                break;
            case 2:
                if (topButtonClicked) {
                    updateStoryAndButtonsTextViews(mIndex = 3);
                } else {
                    updateStoryAndButtonsTextViews(mIndex = 4);
                }
                break;
            case 3:
                if (topButtonClicked) {
                updateStoryAndButtonsTextViews(mIndex = 6);
                } else {
                updateStoryAndButtonsTextViews(mIndex = 5);
                }
                break;
        }
    }

    private void updateStoryAndButtonsTextViews(int storyNumber) {
        switch (storyNumber) {
            case 1: //Story 1
                mStoryTextView.setText(R.string.T1_Story);
                mButtonTop.setText(R.string.T1_Ans1);
                mButtonBottom.setText(R.string.T1_Ans2);
                break;
            case 2: //Story 2
                mStoryTextView.setText(R.string.T2_Story);
                mButtonTop.setText(R.string.T2_Ans1);
                mButtonBottom.setText(R.string.T2_Ans2);
                break;
            case 3: //Story 3
                mStoryTextView.setText(R.string.T3_Story);
                mButtonTop.setText(R.string.T3_Ans1);
                mButtonBottom.setText(R.string.T3_Ans2);
                break;
            case 4: //End 4
                mStoryTextView.setText(R.string.T4_End);
                mButtonTop.setVisibility(Button.GONE);
                mButtonBottom.setVisibility(Button.GONE);
                break;
            case 5: //End 5
                mStoryTextView.setText(R.string.T5_End);
                mButtonTop.setVisibility(Button.GONE);
                mButtonBottom.setVisibility(Button.GONE);
                break;
            case 6: //End 6
                mStoryTextView.setText(R.string.T6_End);
                mButtonTop.setVisibility(Button.GONE);
                mButtonBottom.setVisibility(Button.GONE);
                break;
        }
    }
}

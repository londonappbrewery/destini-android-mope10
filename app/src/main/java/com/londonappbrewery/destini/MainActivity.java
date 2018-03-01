package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mTopButton, mBottomButton;
    int mIndex;

    private RouteLine mRouteArray[] = new RouteLine[]{
      new RouteLine(R.string.T1_Story, R.string.T1_Ans1,R.string.T1_Ans2,2,1),
      new RouteLine(R.string.T2_Story, R.string.T2_Ans1,R.string.T2_Ans2,2,3),
      new RouteLine(R.string.T3_Story, R.string.T3_Ans1,R.string.T3_Ans2,5,4),
      new RouteLine(R.string.T4_End),
      new RouteLine(R.string.T5_End),
      new RouteLine(R.string.T6_End),
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);
        mStoryTextView= (TextView) findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIndex = mRouteArray[mIndex].getNextStoryOnTop();
                continueStory();
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIndex = mRouteArray[mIndex].getNextStoryOnBottom();
                continueStory();
            }
        });

    }

    private void continueStory() {
        int storyID = mRouteArray[mIndex].getStory();
        int topButtonID = mRouteArray[mIndex].getTopButton();
        int bottomButtonID = mRouteArray[mIndex].getButtomButton();


        mStoryTextView.setText(storyID);
        if(topButtonID != -1 && bottomButtonID != -1){
            mTopButton.setText(topButtonID);
            mBottomButton.setText(bottomButtonID);
        } else {
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        }
    }
}

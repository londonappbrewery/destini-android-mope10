package com.londonappbrewery.destini;

/**
 * Created by mope10thegreatfouthnowitaninttimetoreadthis on 28/Feb/2018.
 */

public class RouteLine {
    int mStory;
    int mTopButton;
    int mButtomButton;
    int mNextStoryOnTop;
    int mNextStoryOnBottom;

    public RouteLine(int story, int topButton, int bottomButton, int nexStoryOnTop, int nexStoryOnBottom) {
        mStory = story;
        mTopButton = topButton;
        mButtomButton = bottomButton;
        mNextStoryOnTop = nexStoryOnTop;
        mNextStoryOnBottom = nexStoryOnBottom;
    }

    public RouteLine(int story) {
        mStory = story;
        mButtomButton = -1;
        mNextStoryOnTop = -1;
        mNextStoryOnTop = -1;
        mNextStoryOnBottom = -1;
    }


    public int getStory() {
        return mStory;
    }

    public int getTopButton() {
        return mTopButton;
    }

    public int getButtomButton() {
        return mButtomButton;
    }

    public int getNextStoryOnTop() {
        return mNextStoryOnTop;
    }

    public int getNextStoryOnBottom() {
        return mNextStoryOnBottom;
    }
}



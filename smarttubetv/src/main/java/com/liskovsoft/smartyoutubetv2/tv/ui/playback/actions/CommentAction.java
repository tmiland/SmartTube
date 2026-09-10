package com.liskovsoft.smartyoutubetv2.tv.ui.playback.actions;

import android.content.Context;
import com.liskovsoft.smartyoutubetv2.tv.R;

/**
 * An action for posting a comment on the current video.
 */
public class CommentAction extends TwoStateAction {
    public CommentAction(Context context) {
        super(context, R.id.action_comment, R.drawable.action_chat);

        String[] labels = new String[2];
        // Note, labels denote the action taken when clicked
        labels[INDEX_OFF] = context.getString(R.string.add_comment);
        labels[INDEX_ON] = context.getString(R.string.add_comment);
        setLabels(labels);
    }
}

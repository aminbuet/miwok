package com.azan.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by Md Aminur Rahman on 23/9/17.
 */

public class PhrasesClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(),
                "Open List of phrases",Toast.LENGTH_SHORT).show();

    }
}

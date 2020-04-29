package com.websarva.wings.android.outsei;

import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class tabTest extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView view = new TextView(this);
        view.setText("Tab1");
        setContentView(view);
    }
}

package io.edgedev.screenrecorder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private static final boolean DEBUG = false;
    private static final String TAG = "MainActivity";

    private static final int REQUEST_CODE_SCREEN_CAPTURE = 1;

    private ToggleButton mRecordButton;
    private ToggleButton mPauseButton;
    private MyBroadcastReceiver mReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



}

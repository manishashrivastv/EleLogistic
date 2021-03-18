package com.example.elelogistic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class SplashActivity extends AppCompatActivity {
    private ImageView logo;
    private static int splashTimeOut=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        logo=(ImageView)findViewById(R.id.logo);

        new Handler() {
            public  void postDelayed(Runnable runnable, int splashTimeOut) {
            }

            /**
             * Publish a <tt>LogRecord</tt>.
             * <p>
             * The logging request was made initially to a <tt>Logger</tt> object,
             * which initialized the <tt>LogRecord</tt> and forwarded it here.
             * <p>
             * The <tt>Handler</tt>  is responsible for formatting the message, when and
             * if necessary.  The formatting should include localization.
             *
             * @param record description of the log event. A null record is
             *               silently ignored and is not published
             */
            @Override
            public void publish(LogRecord record) {

            }

            /**
             * Flush any buffered output.
             */
            @Override
            public void flush() {

            }

            /**
             * Close the <tt>Handler</tt> and free all associated resources.
             * <p>
             * The close method will perform a <tt>flush</tt> and then close the
             * <tt>Handler</tt>.   After close has been called this <tt>Handler</tt>
             * should no longer be used.  Method calls may either be silently
             * ignored or may throw runtime exceptions.
             *
             * @throws SecurityException if a security manager exists and if
             *                           the caller does not have <tt>LoggingPermission("control")</tt>.
             */
            @Override
            public void close() throws SecurityException {

            }
        }.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(i);

            }
        },splashTimeOut);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mysplashanimation);
        logo.startAnimation(myanim);
    }
}

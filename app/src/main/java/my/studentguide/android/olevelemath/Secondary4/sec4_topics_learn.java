package my.studentguide.android.olevelemath.Secondary4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import my.studentguide.android.olevelemath.Secondary4.s4topics.matrix4;
import my.studentguide.android.olevelemath.Secondary4.s4topics.probability2;
import my.studentguide.android.olevelemath.Secondary4.s4topics.sets1;
import my.studentguide.android.olevelemath.Secondary4.s4topics.stats3;
import my.studentguide.android.olevelemath.Secondary4.s4topics.vectors5;

public class sec4_topics_learn extends AppCompatActivity {

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        View decorView = getWindow().getDecorView();
        if (hasFocus) {
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(my.studentguide.android.olevelemath.R.layout.activity_sec4_topics_learn);
    }

    public void s4_sets(View view){
        Intent i = new Intent(this, sets1.class);
        startActivity(i);

    }

    public void s4_probability(View view){
        Intent i = new Intent(this, probability2.class);
        startActivity(i);

    }
    public void s4_stats(View view){
        Intent i = new Intent(this, stats3.class);
        startActivity(i);

    }
    public void s4_matrix(View view){
        Intent i = new Intent(this, matrix4.class);
        startActivity(i);

    }

    public void s4_vectors(View view){
        Intent i = new Intent(this, vectors5.class);
        startActivity(i);

    }

}

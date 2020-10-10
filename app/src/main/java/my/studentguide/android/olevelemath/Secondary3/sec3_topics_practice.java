package my.studentguide.android.olevelemath.Secondary3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import my.studentguide.android.olevelemath.Secondary3.S3topics.practice_qsn.linear_ineq_practice;
import my.studentguide.android.olevelemath.Secondary3.S3topics.quad_eqn.quad_eqn_qsn1;

public class sec3_topics_practice extends AppCompatActivity {

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
        setContentView(my.studentguide.android.olevelemath.R.layout.activity_sec3_topics_practice);


    }

    public void quad_qn1 (View view){
        Intent i = new Intent(this, quad_eqn_qsn1.class);
        startActivity(i);

    }
    public void linear_qn (View view){
        Intent i = new Intent(this, linear_ineq_practice.class);
        startActivity(i);

    }

}
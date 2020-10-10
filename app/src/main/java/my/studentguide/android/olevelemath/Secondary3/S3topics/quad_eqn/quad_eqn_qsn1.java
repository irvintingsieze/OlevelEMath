package my.studentguide.android.olevelemath.Secondary3.S3topics.quad_eqn;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

public class quad_eqn_qsn1 extends AppCompatActivity {

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
        setContentView(my.studentguide.android.olevelemath.R.layout.activity_quad_eqn_qsn1);






        TextView equation = (TextView) findViewById(my.studentguide.android.olevelemath.R.id.quad_eqn1);
        SpannableStringBuilder cs = new SpannableStringBuilder("1. Factorise X2 + 2X +1 completely.");
        //cs.setSpan(new SuperscriptSpan(), 11, 12, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        //cs.setSpan(new RelativeSizeSpan(0.75f), 1, 2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        cs.setSpan(new SuperscriptSpan(), 14, 15, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        cs.setSpan(new RelativeSizeSpan(0.75f), 14, 15, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        equation.setText(cs);

        TextView q1opt2 = (TextView) findViewById(my.studentguide.android.olevelemath.R.id.q1opt2);
        SpannableStringBuilder cs1 = new SpannableStringBuilder("(X+1)2");
        cs1.setSpan(new SuperscriptSpan(), 5, 6, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        cs1.setSpan(new RelativeSizeSpan(0.75f), 5, 6, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        q1opt2.setText(cs1);

        TextView q1opt3 = (TextView) findViewById(my.studentguide.android.olevelemath.R.id.q1opt3);
        SpannableStringBuilder cs2 = new SpannableStringBuilder("(X-1)2");
        cs2.setSpan(new SuperscriptSpan(), 5, 6, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        cs2.setSpan(new RelativeSizeSpan(0.75f), 5, 6, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        q1opt3.setText(cs2);}



    public void wrong_qn1 (View v){

        Toast.makeText(quad_eqn_qsn1.this, "Wrong! Nice Try.", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent(quad_eqn_qsn1.this,quad_eqn_qsn2.class);
                startActivity(i);
            }
        }, 2000);

    }

    public void correct_qn1 (View v){

        Toast.makeText(quad_eqn_qsn1.this, "Correct! Well Done!", Toast.LENGTH_SHORT).show();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent(quad_eqn_qsn1.this,quad_eqn_qsn2.class);
                startActivity(i);
            }
        }, 2000);



    }


    }





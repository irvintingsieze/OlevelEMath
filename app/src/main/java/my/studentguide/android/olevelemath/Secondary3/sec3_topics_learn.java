package my.studentguide.android.olevelemath.Secondary3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import my.studentguide.android.olevelemath.Secondary3.S3topics.Linear_Inequality;
import my.studentguide.android.olevelemath.Secondary3.S3topics.app_trigo_learn;
import my.studentguide.android.olevelemath.Secondary3.S3topics.arc_length_area_learn;
import my.studentguide.android.olevelemath.Secondary3.S3topics.area_vol_similar_figures_learn;
import my.studentguide.android.olevelemath.Secondary3.S3topics.cong_n_similar_learn;
import my.studentguide.android.olevelemath.Secondary3.S3topics.coordinate_geo;
import my.studentguide.android.olevelemath.Secondary3.S3topics.further_trigo_learn;
import my.studentguide.android.olevelemath.Secondary3.S3topics.geo_prop_circles_learn;
import my.studentguide.android.olevelemath.Secondary3.S3topics.graph_funct_learn;
import my.studentguide.android.olevelemath.Secondary3.S3topics.s3_indices_learn;
import my.studentguide.android.olevelemath.quad_eqn_contents;

public class sec3_topics_learn extends AppCompatActivity {

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
        setContentView(my.studentguide.android.olevelemath.R.layout.activity_sec3_topics_learn);

    }

    public void s3_indices(View view){
        Intent i = new Intent(this, quad_eqn_contents.class);
        startActivity(i);

    }

    public void s3_linearIneq(View view){
        Intent i = new Intent(this, Linear_Inequality.class);
        startActivity(i);

    }

    public void s3_indices3(View view) {
        Intent i = new Intent (this,s3_indices_learn.class );
        startActivity(i);
    }

    public void s3_coor_geo4(View view) {
        Intent i = new Intent (this,coordinate_geo.class );
        startActivity(i);
    }

    public void s3_graph_funct5(View view) {
        Intent i = new Intent (this,graph_funct_learn.class );
        startActivity(i);
    }

    public void s3_further_trigo6(View view) {
        Intent i = new Intent (this,further_trigo_learn.class );
        startActivity(i);
    }
    public void s3_app_trigo7(View view) {
        Intent i = new Intent (this,app_trigo_learn.class );
        startActivity(i);
    }

    public void s3_arc8(View view) {
        Intent i = new Intent (this,arc_length_area_learn.class );
        startActivity(i);
    }

    public void s3_cong_similar9(View view) {
        Intent i = new Intent (this,cong_n_similar_learn.class );
        startActivity(i);
    }
    public void s3_area_vol_similar_figure10(View view) {
        Intent i = new Intent (this,area_vol_similar_figures_learn.class );
        startActivity(i);
    }

    public void s3_geo_circle11(View view) {
        Intent i = new Intent (this, geo_prop_circles_learn.class );
        startActivity(i);
    }
}
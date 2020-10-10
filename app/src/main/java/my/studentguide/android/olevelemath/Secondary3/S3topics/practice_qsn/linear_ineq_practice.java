package my.studentguide.android.olevelemath.Secondary3.S3topics.practice_qsn;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import my.studentguide.android.olevelemath.Secondary3.sec3_topics_practice;

import java.util.Random;

public class linear_ineq_practice extends AppCompatActivity {

    Button qnopt1, qnopt2, qnopt3, qnopt4;

    TextView score_linear, linear_qn;

    private mlinear_qn linear_qns =  new mlinear_qn();

    private String mAnswer ;

    private int mScore =0;

    private int mQuestionlength = linear_qns.linear_qns.length;

    Random r;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(my.studentguide.android.olevelemath.R.layout.activity_linear_ineq_practice);

        r= new Random();

        qnopt1 =(Button) findViewById(my.studentguide.android.olevelemath.R.id.qnopt1);
        qnopt2 =(Button) findViewById(my.studentguide.android.olevelemath.R.id.qnopt2);
        qnopt3 =(Button) findViewById(my.studentguide.android.olevelemath.R.id.qnopt3);
        qnopt4 =(Button) findViewById(my.studentguide.android.olevelemath.R.id.qnopt4);

        score_linear =(TextView) findViewById(my.studentguide.android.olevelemath.R.id.score_linear);
        linear_qn =(TextView) findViewById(my.studentguide.android.olevelemath.R.id.linear_qn);

        score_linear.setText("Score: "+ mScore);
        updateQuestion (r.nextInt(mQuestionlength));

        qnopt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(qnopt1.getText()== mAnswer){
                    mScore++;
                    score_linear.setText("Score: "+ mScore);
                    updateQuestion(r.nextInt(mQuestionlength));
                }else {
                    youFailed();

                }

            }
        });

        qnopt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(qnopt2.getText()== mAnswer){
                    mScore++;
                    score_linear.setText("Score: "+ mScore);
                    updateQuestion(r.nextInt(mQuestionlength));
                }else {
                    youFailed();

                }

            }
        });

        qnopt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(qnopt3.getText()== mAnswer){
                    mScore++;
                    score_linear.setText("Score: "+ mScore);
                    updateQuestion(r.nextInt(mQuestionlength));
                }else {
                    youFailed();

                }

            }
        });

        qnopt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(qnopt4.getText()== mAnswer){
                    mScore++;
                    score_linear.setText("Score: "+ mScore);
                    updateQuestion(r.nextInt(mQuestionlength));
                }else {
                    youFailed();

                }

            }
        });

    }

    private void updateQuestion(int num){
        linear_qn.setText(linear_qns.get_linear_qn(num));
       qnopt1.setText(linear_qns.linear_c1(num));
        qnopt2.setText(linear_qns.linear_c2(num));
        qnopt3.setText(linear_qns.linear_c3(num));
        qnopt4.setText(linear_qns.linear_c4(num));

        mAnswer = linear_qns.correct_linear_ans(num);


    }

    private void youFailed(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(linear_ineq_practice.this);
        alertDialogBuilder .setMessage("Good Job!! Your Score is: " + mScore + " points")
                .setCancelable(false)
                .setPositiveButton("Retry",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                startActivity(new Intent(getApplicationContext(), linear_ineq_practice.class));

                            }
                        })
                                .setNegativeButton("Exit",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int i) {
                                                startActivity(new Intent(getApplicationContext(), sec3_topics_practice.class));

                                            }
                                        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();



    }
}

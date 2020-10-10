package my.studentguide.android.olevelemath.Secondary3.S3topics.practice_qsn;

/**
 * Created by ting on 26/3/2018.
 */

public class mlinear_qn {

    public String linear_qns [] = {
            "\u221A",
            "8 + 26",
            "51 + 67",
            "15 + 26",
            "58 + 16",
            "5 + 10",
            "41 + 32",
            "50 + 60",
            "16 + 18",
            "21 + 8"};

            private String[][] linear_choices  ={
                    {"11","12","13","21"},
                    {"43","31","34","30"},
                    {"11","18","181","118"},
                    {"41","14","42","13"},
                    {"74","73","72","75"},
                    {"11","15","13","12"},
                    {"47","74","37","73"},
                    {"100","10","110","11"},
                    {"63","36","34","43"},
                    {"25","31","27","29"}



            };

            private String  linear_correct []=
                    {"11","34","118","41","74","15","73","110","34","29" }

            ;

            public String get_linear_qn (int a){
                String linear_question = linear_qns[a];
                return linear_question;
            }

            public String linear_c1(int a){
                String choice = linear_choices[a][0];
                return  choice;


            }

    public String linear_c2(int a){
        String choice = linear_choices[a][1];
        return  choice;


    }

    public String linear_c3(int a){
        String choice = linear_choices[a][2];
        return  choice;


    }

    public String linear_c4(int a){
        String choice = linear_choices[a][3];
        return  choice;


    }

    public String correct_linear_ans (int a){
        String answer  = linear_correct [a];
        return answer;

    }





}

package my.studentguide.android.olevelemath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class quad_eqn_contents extends AppCompatActivity {

    WebView webView;

    public String fileName = "myfile.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quad_eqn_contents);

        webView = (WebView) findViewById(R.id.s3_indices_content);
        // displaying content in WebView from html file that stored in assets folder
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.loadUrl("file:///android_asset/quadraticEqnLearn.html");



    }
}

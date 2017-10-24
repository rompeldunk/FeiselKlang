package bbconsulting.feiselklang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class MainActivity extends AppCompatActivity {

     public PDFView pdfView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        pdfView = (PDFView)findViewById(R.id.pdfView);
        pdfView.fromAsset("feisel_ferdig2.pdf").scrollHandle(new DefaultScrollHandle(this)).load();
    }
}

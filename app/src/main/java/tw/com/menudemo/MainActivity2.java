package tw.com.menudemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button endbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        endbtn= findViewById(R.id.endbtn);

        endbtn.setOnClickListener(v -> {
            finish(); //關閉此頁
        });
    }
}
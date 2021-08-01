package tw.com.menudemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);



        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.setting:
                //Toast.makeText(MainActivity.this,"設定",Toast.LENGTH_SHORT);
                break;
            case R.id.infome:
                //Toast.makeText(getApplicationContext(),"關於我",Toast.LENGTH_SHORT);
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);

                break;
            case R.id.logout:
                //Toast.makeText(getApplicationContext(),"登出",Toast.LENGTH_SHORT);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;

    }
}
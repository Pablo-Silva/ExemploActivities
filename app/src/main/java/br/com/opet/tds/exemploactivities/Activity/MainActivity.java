package br.com.opet.tds.exemploactivities.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.opet.tds.exemploactivities.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectedActivity(View view){
        switch (view.getId()){
            case R.id.btnBottom:
                openActivity(BottomActivity.class);
                break;
            case R.id.btnDrawer:
                openActivity(DrawerActivity.class);
                break;
            case R.id.btnFloat:
                openActivity(FloatActivity.class);
                break;
            case R.id.btnMaster:
                openActivity(BookListActivity.class);
                break;
            case R.id.btnScrolling:
                openActivity(ScrollingActivity.class);
                break;
            case R.id.btnTabbed:
                openActivity(TabbedActivity.class);
                break;
        }
    }

    public void openActivity(Class classe){
        Intent newIntent = new Intent(MainActivity.this,classe);
        startActivity(newIntent);
    }
}

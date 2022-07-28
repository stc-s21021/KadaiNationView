package jp.suntech.s21021.kadainationview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lvCountry = findViewById(R.id.lvCountry);
        lvCountry.setOnItemClickListener(new ListItemClickListener());
    }

    private class ListItemClickListener implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int pasition, long id) {
            TextView ShowCountry = findViewById(R.id.tvCountry);
            String item = (String) parent.getItemAtPosition(pasition);
            String show = item;
            ShowCountry.setText(show);
        }
    }
}
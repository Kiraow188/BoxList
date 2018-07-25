package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvColors;
    ArrayList<String> alColor;
    CustomAdapter caColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColors = findViewById(R.id.listViewColor);

        alColor = new ArrayList<>();
        alColor.add("blue");
        alColor.add("orange");
        alColor.add("brown");

        caColor = new CustomAdapter(this, R.layout.color_row, alColor);

        lvColors.setAdapter(caColor);

    }
}

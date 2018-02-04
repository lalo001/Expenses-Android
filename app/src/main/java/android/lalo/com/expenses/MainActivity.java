package android.lalo.com.expenses;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Resumen");
        setSupportActionBar(toolbar);

        ArrayList<String> dummy = new ArrayList<>();
        dummy.add("McDonald's");
        dummy.add("Soborno FBI");
        dummy.add("Adelanto Muro");
        dummy.add("Shhh");
        dummy.add("Salario Nunes");
        ArrayAdapter<String> dummyAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, dummy);
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(dummyAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}

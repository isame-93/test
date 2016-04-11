package miage.jedurand.buenligne;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jedurand on 10/02/2016.
 */
public class a2 extends MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a2);
        List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3"));
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        ListView listViews = (ListView) findViewById(R.id.list_view);
        listViews.setAdapter(adapter);
        listViews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(a2.this, a3.class);
                intent.putExtra("selected", (String) adapterView.getItemAtPosition(position));
                startActivity(intent);
            }
        });
    }

    public void onClick(View v) {
        Intent mIntent;
        mIntent = new Intent(a2.this, a4.class);
        startActivity(mIntent);
    }
}

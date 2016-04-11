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

public class a0 extends MainActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);
        List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3"));
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        ListView listViews = (ListView) findViewById(R.id.list_view);
        listViews.setAdapter(adapter);
        listViews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(a0.this, a1.class);
                intent.putExtra("selected", (String) adapterView.getItemAtPosition(position));
                startActivity(intent);
            }
        });
    }
}

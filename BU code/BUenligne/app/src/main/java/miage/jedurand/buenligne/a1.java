package miage.jedurand.buenligne;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class a1 extends MainActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a1);
        String selected;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                selected = null;
            } else {
                selected = extras.getString("selected");
            }
        } else {
            selected = (String) savedInstanceState.getSerializable("selected");
        }
        findViewById(R.id.txt_livre).setText(selected);
        findViewById(R.id.txt_auteur).setText("Auteur");
        findViewById(R.id.txt_date_emprunt).setText("Date emprunt");
        findViewById(R.id.txt_date_limite).setText("Date limite");
    }
    public void selectAction(View view) {
        Intent mIntent;
        switch (view.getId()) {
            case R.id.btn_configuration:
                mIntent = new Intent(a1.this, a2.class);
                startActivity(mIntent);
                break;
            case R.id.btn_prolongation:
                mIntent = new Intent(a1.this, a2.class);
                startActivity(mIntent);
                break;
        }
    }
}

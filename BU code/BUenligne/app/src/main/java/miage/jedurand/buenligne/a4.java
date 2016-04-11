package miage.jedurand.buenligne;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class a4 extends MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4);
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
        findViewById(R.id.txt_alerte).setText(selected);
        findViewById(R.id.txt_declencher).setText("Déclencher");
        findViewById(R.id.txt_rappels).setText("Rappels");
        findViewById(R.id.txt_rappels_jours).setText("Rappels tous les X jours");
    }

    public void selectAction(View view) {
        Intent mIntent;
        mIntent = new Intent(a4.this, a4.class);
        startActivity(mIntent);
    }
}

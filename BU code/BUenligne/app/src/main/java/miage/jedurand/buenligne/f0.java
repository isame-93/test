package miage.jedurand.buenligne;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class f0 extends MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.f0);
        //charger message de blocage
        findViewById(R.id.txt_blogage).setText("Il reste x jours de blocage");
    }
    public void selectAction(View view) {
        Intent mIntent;
        switch (view.getId()) {
            case R.id.btn_livres:
                mIntent = new Intent(f0.this, a0.class);
                startActivity(mIntent);
                break;
            case R.id.btn_configuration:
                mIntent = new Intent(f0.this, b0.class);
                startActivity(mIntent);
                break;
            case R.id.btn_historique:
                mIntent = new Intent(f0.this, c0.class);
                startActivity(mIntent);
                break;
        }
    }
}

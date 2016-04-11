package miage.jedurand.buenligne;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class accueil extends MainActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil);
    }
    public void selectAction(View view) {
        Intent mIntent;
        switch (view.getId()) {
            case R.id.btn_emprunts:
                mIntent = new Intent(accueil.this, f0.class);
                startActivity(mIntent);
                break;
            case R.id.btn_recherche:
                mIntent = new Intent(accueil.this, f1.class);
                startActivity(mIntent);
                break;
            case R.id.btn_contact:
                mIntent = new Intent(accueil.this, f2.class);
                startActivity(mIntent);
                break;
        }
    }
}

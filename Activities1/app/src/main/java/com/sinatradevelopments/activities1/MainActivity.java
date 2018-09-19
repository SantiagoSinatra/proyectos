package com.sinatradevelopments.activities1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button botonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonEnviar = findViewById(R.id.button_activitymain_enviar);

        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText unEditText = findViewById(R.id.edittext_activitymain_envio);

                if (unEditText.getText().toString().length()>0){
                    Intent unIntent = new Intent(MainActivity.this, ReceptorActivity.class);
                    String envio = unEditText.getText().toString();

                    Bundle unBundle = new Bundle();
                    unBundle.putString(ReceptorActivity.CLAVE_ENVIO, envio);

                    unIntent.putExtras(unBundle);

                    startActivity(unIntent);
                }
            }
        });

    }
}

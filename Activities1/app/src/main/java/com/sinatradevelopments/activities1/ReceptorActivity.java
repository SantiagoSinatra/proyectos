package com.sinatradevelopments.activities1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceptorActivity extends AppCompatActivity {

    public static final String CLAVE_ENVIO = "envio_main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);

        Intent unIntent = getIntent();

        Bundle unBundle = unIntent.getExtras();

        String unEnvio =  unBundle.getString(CLAVE_ENVIO);

        TextView textView = findViewById(R.id.textview_receptoractivity_reciboenvio);
        textView.setText(unEnvio);
    }
}

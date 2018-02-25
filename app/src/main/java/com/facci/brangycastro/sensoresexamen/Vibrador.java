package com.facci.brangycastro.sensoresexamen;

import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vibrador extends AppCompatActivity implements View.OnClickListener{

    Button apagado, encendido;
    Vibrator vibrador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibrador);

        apagado = (Button) findViewById(R.id.btnApagado);
        encendido = (Button) findViewById(R.id.btnEncendido);

        vibrador = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        apagado.setOnClickListener(this);
        encendido.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnApagado:
                vibrador.cancel();
                break;
            case R.id.btnEncendido:
                vibrador.vibrate(500);
                break;
        }
    }
}

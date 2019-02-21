package com.example.usuario.quizprogramacin;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction miTransacion=miManejador.beginTransaction();
        FragmentoMaster mifragmento1=new FragmentoMaster();
        miTransacion.add(R.id.contenedor1,mifragmento1);
        miTransacion.commit();
    }
    public void irI(View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction miTransacion=miManejador.beginTransaction();
        FragmentoIZ mifragmento1=new FragmentoIZ();
        miTransacion.replace(R.id.contenedor1,mifragmento1);
        miTransacion.commit();
    }
    public void irD(View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction miTransacion=miManejador.beginTransaction();
        FragmentoD mifragmento1=new FragmentoD();
        miTransacion.replace(R.id.contenedor1,mifragmento1);
        miTransacion.commit();
    }
    public void DevolverMaster(View V){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction miTransacion=miManejador.beginTransaction();
        FragmentoMaster mifragmento1=new FragmentoMaster();
        miTransacion.replace(R.id.contenedor1,mifragmento1);
        miTransacion.commit();

    }



}

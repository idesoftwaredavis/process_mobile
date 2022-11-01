package com.davis.tareas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class tasks extends AppCompatActivity {

    ListView listaTareas;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);

        /*
        //listaTareas = (ListView) findViewById(R.id.listaTareas);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);

        adapter.add("Completar la tarea de ingles");
        adapter.add("La tarea del funcionario y empresa");
        adapter.add("Reasignar en terreno");
        // Agregarle el adaptador a la lista
        listaTareas.setAdapter(adapter);*/

        ListView listaTareas = findViewById(R.id.listaTareas);

        List<String> list = new ArrayList();
        list.add("Apple");
        list.add("Banana");
        list.add("Ernesta");

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listaTareas.setAdapter(adapter);

        listaTareas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                   startActivity(new Intent(tasks.this,detalle_tarea.class));
                }
            }
        });

    }



}
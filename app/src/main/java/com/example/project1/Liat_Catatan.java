package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.project1.adapters.catatanAdapter;
import com.example.project1.models.Catatan;

import java.util.ArrayList;
import java.util.List;

public class Liat_Catatan extends AppCompatActivity {
    //instansiasi Recyclerview
    RecyclerView rvCatatan;
    //instansiasi list superhero
    List<Catatan> listCatatan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //make activity fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);

        //Hide the action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_liat_catatan);
        listCatatan = MainMenu.listCatatan;
        //menyambungkan rvSuperHero ke layout
        rvCatatan = findViewById(R.id.rv_listCatatan);
        //Instansiasi Adapter
        catatanAdapter adapter = new catatanAdapter(listCatatan);
        //set adapter dan layoutmanager
        rvCatatan.setAdapter(adapter);
        rvCatatan.setLayoutManager(new LinearLayoutManager(this));
    }
}
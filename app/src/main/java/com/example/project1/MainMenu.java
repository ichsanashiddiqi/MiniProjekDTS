package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.project1.models.Catatan;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends AppCompatActivity {
    public static List<Catatan> listCatatan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //make activity fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main_menu);

        //Hide the action bar
        getSupportActionBar().hide();
    }

    public void tmbhPengeluaran(View view) {
        Intent intent= new Intent(MainMenu.this, tambahCatatan.class);
        startActivityForResult(intent,99);
    }

    public void liatListPengeluaran(View view) {
        Intent intent= new Intent(MainMenu.this, Liat_Catatan.class);
        startActivity(intent);
    }


}
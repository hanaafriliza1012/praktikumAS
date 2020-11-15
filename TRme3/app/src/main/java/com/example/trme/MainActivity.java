package com.example.trme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    //activity_create_to_do membuat object baru
    public FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //activity_create_to_do
        floatingActionButton = findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CreateToDo.class);
                startActivity(intent);
            }
        });
    }

    //Options_menu
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch (id)
        {

            case R.id.menu3:
                Intent intent = new Intent(MainActivity.this, Settings.class);
                startActivity(intent);
                Toast.makeText(this,"Settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu2:
                Intent intent1 = new Intent(MainActivity.this, OptionsMenu.class);
                startActivity(intent1);
                Toast.makeText(this, "Delete all", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu1:
                Intent intent2 = new Intent(MainActivity.this, OptionsMenu.class);
                startActivity(intent2);
                Toast.makeText(this, "Edit List", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
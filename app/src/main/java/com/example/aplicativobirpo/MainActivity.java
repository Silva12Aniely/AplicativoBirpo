package com.example.aplicativobirpo;
//SEGUNDO APP BIRPO
import android.os.Bundle;

import com.example.aplicativobirpo.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbarProd);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.DrawerMain_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setTitle("Heellooooo");
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.DrawerMain_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main_birpo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.mcart) {
            Toast.makeText(getApplicationContext(), "Carrinho", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Mgroceries:
                Toast.makeText(getApplicationContext(), "Groceries", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Mdirect:
                Toast.makeText(getApplicationContext(), "Direct", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Mclothing:
                Toast.makeText(getApplicationContext(), "Clothing", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Mtech_Game:
                Toast.makeText(getApplicationContext(), "Technology & Gaming", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Minfo:
                Toast.makeText(getApplicationContext(), "Information", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Mlogout:
                Toast.makeText(getApplicationContext(), "Logout", Toast.LENGTH_SHORT).show();
                break;
        }

        DrawerLayout drawer = findViewById(R.id.DrawerMain_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
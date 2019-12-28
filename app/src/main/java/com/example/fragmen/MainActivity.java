package com.example.fragmen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button delhi, mumbai, bangalore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        delhi = findViewById(R.id.delhi);
        delhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DelhiFragment delhiFragment = new DelhiFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.layout,delhiFragment,delhiFragment.getTag()).commit();
            }
        });
        mumbai = findViewById(R.id.mumbai);
        mumbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MumbaiFragment mumbaiFragment = new MumbaiFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.layout,mumbaiFragment,mumbaiFragment.getTag()).commit();
            }
        });
        bangalore = findViewById(R.id.bangalore);
        bangalore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BangaloreFragment bangalore = new BangaloreFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.layout,bangalore,bangalore.getTag()).commit();
            }
        });


    }

    public void Durg(View view) {
        DurgFragment durgFragment = new DurgFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.layout,durgFragment,durgFragment.getTag()).commit();
    }

    public void Bhilai(View view) {
        BhilaiFragment bhilaiFragment = new BhilaiFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.layout,bhilaiFragment,bhilaiFragment.getTag()).commit();
    }
}

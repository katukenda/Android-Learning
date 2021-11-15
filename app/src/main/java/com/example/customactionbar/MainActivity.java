package com.example.customactionbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView leftIcon = findViewById(R.id.left_icon);
        ImageView rightIcon = findViewById(R.id.right_icon);
        TextView title = findViewById(R.id.toolbar_titile);

        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You Click in left icon", Toast.LENGTH_SHORT).show();
            }
        });
        rightIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMenu(v);
            }
        });

        title.setText(("Easy Tutorial"));

    }

    private void showMenu(View v){
        PopupMenu popupMenu = new PopupMenu(MainActivity.this,v);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(item.getItemId() == R.id.one){
                    Toast.makeText(MainActivity.this, "You Click One ", Toast.LENGTH_SHORT).show();
                }
                else if(item.getItemId() == R.id.two){
                    Toast.makeText(MainActivity.this, "You Click Two ", Toast.LENGTH_SHORT).show();
                }
                else if(item.getItemId() == R.id.three){
                    Toast.makeText(MainActivity.this, "You Click Three ", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });

        popupMenu.show();


    }



}
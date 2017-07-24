package com.example.deepa.contextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int COMPUTER_MENU_ITEM = Menu.FIRST;
    private static final int GAME_MENU_ITEM = COMPUTER_MENU_ITEM + 1;
    private static final int CAMERA_MENU_ITEM = GAME_MENU_ITEM + 1;
    private static final int VIDEO_MENU_ITEM = CAMERA_MENU_ITEM + 1;
    private static final int EMAIL_MENU_ITEM = VIDEO_MENU_ITEM + 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        super.onCreateOptionsMenu(menu);
//VIDEO_MENU_ITEM  EMAIL_MENU_ITEM
        menu.add(0, COMPUTER_MENU_ITEM, 0, "Computer");
        menu.add(0, GAME_MENU_ITEM, 0, "Gamepad");
        menu.add(0, CAMERA_MENU_ITEM, 0, "Camera");
        menu.add(0, VIDEO_MENU_ITEM, 0, "Video");
        menu.add(0, EMAIL_MENU_ITEM, 0, "Email");



        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case COMPUTER_MENU_ITEM:
                Toast.makeText(MainActivity.this, "You Clicked on Computer", Toast.LENGTH_LONG).show();

                break;

            case GAME_MENU_ITEM:
                Toast.makeText(MainActivity.this, "You Clicked on Gamepad", Toast.LENGTH_LONG).show();

                break;

            case CAMERA_MENU_ITEM:
                Toast.makeText(MainActivity.this, "You Clicked on Camera", Toast.LENGTH_LONG).show();

                break;

            case VIDEO_MENU_ITEM:
                Toast.makeText(MainActivity.this, "You Clicked on Video", Toast.LENGTH_LONG).show();

                break;

            case EMAIL_MENU_ITEM:
                Toast.makeText(MainActivity.this, "You Clicked on Email", Toast.LENGTH_LONG).show();

                break;


        }
        return super.onOptionsItemSelected(item);

    }
}



package com.example.android.thestation;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);



        //Station Button
        Button stationButton = (Button) findViewById(R.id.stationButton);
        if (stationButton != null) {
            stationButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    //Toast.makeText(MainActivity.this, "Button Clicked",	Toast.LENGTH_SHORT).show();
                    TextView moneyView;
                    moneyView = (TextView) findViewById(R.id.moneyView);
                    int monies = Integer.parseInt(moneyView.getText().toString());
                    monies++;
                    moneyView.setText("" + monies);
                    System.out.println("moneyView: " + moneyView);
                    System.out.println("Monies: " + monies);
                }
            });
        }

        //Crew Button
        Button crewButton = (Button) findViewById(R.id.crewButton);
        if (crewButton != null) {
            crewButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "Crew Placeholder",	Toast.LENGTH_SHORT).show();
                }
            });
        }

        //Research Button
        Button researchButton = (Button) findViewById(R.id.researchButton);
        if (researchButton != null) {
            researchButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "Research Placeholder",	Toast.LENGTH_SHORT).show();
                }
            });
        }

        //Mission Button
        Button missionButton = (Button) findViewById(R.id.missonButton);
        if (missionButton != null) {
            missionButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "Mission Placeholder",	Toast.LENGTH_SHORT).show();
                }
            });
        }

        //Marquee
        TextView marqueeView;
        marqueeView = (TextView) findViewById(R.id.marqueeView);
        marqueeView.setSelected(true);

    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}

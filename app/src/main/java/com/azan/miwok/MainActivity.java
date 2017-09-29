package com.azan.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.azan.miwok.R;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view Numbers Category
        TextView numbers = (TextView)findViewById(R.id.numbers);


        //set a click listener on that view
        numbers.setOnClickListener(new NumbersClickListener(){

            @Override
            public void onClick(View view){
                //create open intent to open {@link NNumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });


        //Find the view Family members  Category
        TextView family = (TextView)findViewById(R.id.family);

        //set a click listener on that view
        family.setOnClickListener(new FamilyClickListener(){

            @Override
            public void onClick(View view){
                //create open intent to open {@link FamilyActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        });

        //Find the view Colors Category
        TextView colors = (TextView)findViewById(R.id.colors);

        //set a click listener on that view
        colors.setOnClickListener(new ColorsClickListener(){

            @Override
            public void onClick(View view){
                //create open intent to open {@link ColorsActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });

        //Find the view Phrases Category
        TextView phrases = (TextView)findViewById(R.id.phrases);

        //set a click listener on that view
        phrases.setOnClickListener(new PhrasesClickListener(){

            @Override
            public void onClick(View view){
                //create open intent to open {@link PhrasesActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                // Start the new activity
                startActivity(phrasesIntent);
            }
        });
    }

}
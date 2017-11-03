package com.example.android.practiceset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int  counter,c;
    Button reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reset=(Button)findViewById(R.id.b1);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 counter=0;
                c=0;
                displayTeamB(c);
                displayTeamA(counter);

            }
        });
        // PASTE CODE YOU WANT TO TEST HERE
//displayForTeamA(45);

    }



public  void addThreeForTeamA(View view){
    counter=counter+3;
 displayTeamA(counter);
}




   public void addTwoForTeamA(View v){
       counter=counter+2;
        displayTeamA(counter);
    }

    public void addOneForTeamA(View v){
        counter=counter+1;
        displayTeamA(counter);
    }
    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */

    public void addThreeForTeamB(View v){
       c=c+3;
        displayTeamB(c);
    }

    public void addTwoForTeamB(View v){
        c=c+2;
        displayTeamB(c);
    }

    public void addOneForTeamB(View v){
        c=c+1;
        displayTeamB(c);
    }
public void displayTeamA(int disp){
TextView score=(TextView)findViewById(R.id.team_a_score);
    score.setText(""+disp);


}
    public void displayTeamB(int disp){
        TextView score=(TextView)findViewById(R.id.team_b);
        score.setText(""+disp);
    }
}
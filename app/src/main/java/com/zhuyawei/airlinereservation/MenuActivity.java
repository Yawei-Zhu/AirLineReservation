package com.zhuyawei.airlinereservation;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ImageButton ibtnSearchBranch = (ImageButton)findViewById(R.id.ibtn_search_branch);
        ImageButton ibtnSearchFlightPlan = (ImageButton)findViewById(R.id.ibtn_search_flight_plan);
        ibtnSearchBranch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuActivity.this,SearchBranchActivity.class);
                startActivity(i);
            }
        });
        ibtnSearchFlightPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuActivity.this, SearchFlightPlanActivity.class);
                startActivity(i);
            }
        });

    }

//    public void doClick(View view){
//        Intent i = null;
//        switch (view.getId()){
//            case R.id.ibtn_search_branch:
//                i = new Intent(MenuActivity.this,SearchBranchActivity.class);
//                break;
//            case R.id.ibtn_search_flight_plan:
//                i = new Intent(MenuActivity.this,SearchFlightPlanActivity.class);
//                break;
//        }
//        startActivity(i);
//    }

}

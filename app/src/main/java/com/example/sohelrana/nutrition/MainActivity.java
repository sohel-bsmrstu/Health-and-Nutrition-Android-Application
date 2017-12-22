package com.example.sohelrana.nutrition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String[] array={"স্বাস্থ্য পরামর্শ","পুষ্টি পরামর্শ","স্বাস্থ্য রান্না প্রণালী","পুষ্টি ক্যালকুলেটর"," ঘরোয়া প্রতিকার","ভিটামিন ও খনিজ উৎস","গোটা শস্য পুষ্টি তথ্য"};
    int []im={R.drawable.health,R.drawable.health3,R.drawable.home,R.drawable.calculator,R.drawable.recipies,R.drawable.vitamins,R.drawable.grain};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.listView);
        Adapter adapter=new Adapter(this,array,im);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s=(String)lv.getItemAtPosition(position);
                if (position==0){
                    Intent i=new Intent(MainActivity.this,Healthtips.class);
                    startActivity(i);
                }
                if (position==1) {
                    Intent i = new Intent(MainActivity.this, Nutrition.class);
                    startActivity(i);
                }
                if(position==2)
                {
                    Intent i=new Intent(MainActivity.this,Recipies.class);
                    startActivity(i);
                }
                if(position==3)
                {
                    Intent i=new Intent(MainActivity.this,Calculators.class);
                    startActivity(i);
                }
                if (position==4){
                    Intent i=new Intent(MainActivity.this,Remedies.class);
                    startActivity(i);
                }
                if (position==5){
                    Intent i=new Intent(MainActivity.this,Vitamins.class);
                    startActivity(i);
                }
                if (position==6){
                    Intent i=new Intent(MainActivity.this,Grains.class);
                    startActivity(i);
                }
            }
        });
    }
}

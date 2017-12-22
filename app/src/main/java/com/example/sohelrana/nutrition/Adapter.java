package com.example.sohelrana.nutrition;


import android.content.Context;
import android.preference.PreferenceActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sohelrana.nutrition.R;

public class Adapter extends ArrayAdapter<String> {

    //Variable Declarations
    public String[] array={};
    public int[] im={};
    Context c;
    LayoutInflater inflater;
    // TODO Auto generate conostructor
    public Adapter(Context context, String[] array, int[] im) {
        super(context, R.layout.sohel,array);
        //TODO Auto generate conostructors sub
        this.c=context;
        this.array=array;
        this.im=im;
    }
    //TODO Holder class
    public class VeiwHolder {
        TextView text;
        ImageView im;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //TODO generate method
        if (convertView==null) {
            inflater=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView =inflater.inflate(R.layout.sohel,null);
        }
        //TODO our Holder object
        VeiwHolder holder=new VeiwHolder();
        //TODO initial our veiws

        holder.text=(TextView)convertView.findViewById(R.id.text);
        holder.im=(ImageView)convertView.findViewById(R.id.imageView);
        //TODO data assign

        holder.im.setImageResource(im[position]);
        holder.text.setText(array[position]);

        return convertView;
    }
}


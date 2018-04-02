package com.kaplanteam.cathy.dangerparty.Level3;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.kaplanteam.cathy.dangerparty.R;

/**
 * Created by Cole on 4/1/18.
 */

public class FragmentLevel3A extends Fragment implements View.OnClickListener {
    private Button moistyTequila, backtrack;
    private ImageView sapphire, ruby, diamond, emerald, amethyst, topaz, left_cave, right_cave, flashlight,
        bat1, bat2, bat3, bat4, bat5;
    private ConstraintLayout background;
    private boolean lightOn;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.level3a, container, false);

        //wire any widgets -- must use rootView.findViewById
        lightOn = true;
        wireWidgets(rootView);
        setListeners();

        //get any other initial set up done

        //return the view that we inflated
        return rootView;
    }

    private void wireWidgets(View rootView) {
        moistyTequila = rootView.findViewById(R.id.button_moisty_tequila);
        backtrack = rootView.findViewById(R.id.button_backtrack);
        sapphire = rootView.findViewById(R.id.imageView_sapphire);
        ruby = rootView.findViewById(R.id.imageView_ruby);
        diamond = rootView.findViewById(R.id.imageView_diamond);
        emerald = rootView.findViewById(R.id.imageView_emerald);
        amethyst = rootView.findViewById(R.id.imageView_amethyst);
        topaz = rootView.findViewById(R.id.imageView_topaz);
        left_cave = rootView.findViewById(R.id.imageView_left_cave);
        right_cave = rootView.findViewById(R.id.imageView_right_cave);
        flashlight = rootView.findViewById(R.id.imageView_flashlight);
        background = rootView.findViewById(R.id.level3a_background);
        bat1 = rootView.findViewById(R.id.imageView_bat1);
        bat2 = rootView.findViewById(R.id.imageView_bat2);
        bat3 = rootView.findViewById(R.id.imageView_bat3);
        bat4 = rootView.findViewById(R.id.imageView_bat4);
        bat5 = rootView.findViewById(R.id.imageView_bat5);
    }

    private void setListeners() {
        moistyTequila.setOnClickListener(this);
        backtrack.setOnClickListener(this);
        sapphire.setOnClickListener(this);
        ruby.setOnClickListener(this);
        diamond.setOnClickListener(this);
        emerald.setOnClickListener(this);
        amethyst.setOnClickListener(this);
        topaz.setOnClickListener(this);
        left_cave.setOnClickListener(this);
        right_cave.setOnClickListener(this);
        flashlight.setOnClickListener(this);
        bat1.setOnClickListener(this);
        bat2.setOnClickListener(this);
        bat3.setOnClickListener(this);
        bat4.setOnClickListener(this);
        bat5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.imageView_flashlight:
                if(lightOn){
                    flashlight.setImageResource(R.drawable.light_off);
                    background.setBackgroundColor(Color.BLACK);
                    bat1.setVisibility(View.VISIBLE);
                    bat2.setVisibility(View.VISIBLE);
                    bat3.setVisibility(View.VISIBLE);
                    bat4.setVisibility(View.VISIBLE);
                    bat5.setVisibility(View.VISIBLE);
                }
                else{
                    flashlight.setImageResource(R.drawable.light_on);
                    background.setBackgroundColor(Color.WHITE);
                    bat1.setVisibility(View.INVISIBLE);
                    bat2.setVisibility(View.INVISIBLE);
                    bat3.setVisibility(View.INVISIBLE);
                    bat4.setVisibility(View.INVISIBLE);
                    bat5.setVisibility(View.INVISIBLE);
                }
                lightOn = ! lightOn;
                break;
        }
    }

}
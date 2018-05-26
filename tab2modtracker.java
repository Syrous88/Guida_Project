package com.example.cmauriel.guida;

/**
 * Created by CMAURIEL on 26/05/2018.
 */

import android.content.Intent;
import android.sax.StartElementListener;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class tab2modtracker extends Fragment{




   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.tab2modtracker, container, false);

       Button btns = (Button) view.findViewById(R.id.silence);
       Button btni = (Button) view.findViewById(R.id.locationIter);

       //Button per modalità silenziosa
       btns.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent in1 = new Intent(getActivity(), SilenceMode.class);
               startActivity(in1);

           }
       });

       //Button per modalità Itinerario
       btni.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {

               Intent in2 = new Intent(getActivity(), RoadMapMode.class);
               startActivity(in2);

           }
       } );


       return view;
   }


}

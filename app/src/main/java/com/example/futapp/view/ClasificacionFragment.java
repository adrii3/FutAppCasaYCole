package com.example.futapp.view;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.futapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ClasificacionFragment extends Fragment {

    Button botonMadrid;
    Button botonBarcelona;

    public ClasificacionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_clasificacion, container, false);
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        botonMadrid = view.findViewById(R.id.boton_clasificacion_madrid);
        botonBarcelona = view.findViewById(R.id.boton_clasificacion_barcelona);

        botonMadrid.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.equipoFragment);
            }
        });

        botonBarcelona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.equipoFragment);
            }
        });

    }
}

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
public class JornadasFragment extends Fragment {

    Button botonResultado1;
    Button botonResultado2;

    public JornadasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jornadas, container, false);
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        botonResultado1= view.findViewById(R.id.boton_jornadas_resultado1);

        botonResultado1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.estadisticaPartido1Fragment);
            }
        });

        botonResultado2= view.findViewById(R.id.boton_jornadas_resultado2);

        botonResultado2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.estadisticaPartido1Fragment);
            }
        });


    }
}

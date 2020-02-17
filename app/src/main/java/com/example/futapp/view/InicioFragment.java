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
public class InicioFragment extends Fragment {

    Button botonClasificacion;
    Button botonJornadas;
    Button botonAyuda;


    public InicioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inicio, container, false);
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        botonClasificacion = view.findViewById(R.id.boton_inicio_clasificacion);

        botonClasificacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.clasificacionFragment);
            }
        });

        botonJornadas= view.findViewById(R.id.boton_inicio_jornadas);

        botonJornadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.jornadasFragment);
            }
        });

        botonAyuda = view.findViewById(R.id.boton_inicio_ayuda);
        botonAyuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.ayudaFragment);
            }
        });

    }
}

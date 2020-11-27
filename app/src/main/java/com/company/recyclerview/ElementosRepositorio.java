package com.company.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class ElementosRepositorio {

    List<Elemento> elementos = new ArrayList<>();

    interface Callback {
        void cuandoFinalice(List<Elemento> elementos);
    }

    ElementosRepositorio(){
        elementos.add(new Elemento("dani hernandez", "Es un átomo con moléculas, aquella sustancia que no puede ser descompuesta mediante una reacción química, en otras más simples. Pueden existir dos átomos de un mismo elemento con características distintas y, en el caso de que estos posean número másico distinto, pertenecen al mismo elemento pero en lo que se conoce como uno de sus isótopos."));
        elementos.add(new Elemento("marte", "En teoría de conjuntos, un elemento o miembro de un conjunto (o familia de conjuntos) es un objeto que forma parte de ese conjunto (o familia)."));
        elementos.add(new Elemento("jupiter", "asdkfjñlskdjf elemento"));
        elementos.add(new Elemento("saturno", "kasñdjfñlaksdj"));
        elementos.add(new Elemento("urano","añklsdjfñlask"));
        elementos.add(new Elemento("oscar","sadflkasdlf´k"));
    }

    List<Elemento> obtener() {
        return elementos;
    }

    void insertar(Elemento elemento, Callback callback){
        elementos.add(elemento);
        callback.cuandoFinalice(elementos);
    }

    void eliminar(Elemento elemento, Callback callback) {
        elementos.remove(elemento);
        callback.cuandoFinalice(elementos);
    }

    void actualizar(Elemento elemento, float valoracion, Callback callback) {
        elemento.valoracion = valoracion;
        callback.cuandoFinalice(elementos);
    }
}

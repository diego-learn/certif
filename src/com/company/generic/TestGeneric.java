package com.company.generic;

import java.util.ArrayList;
import java.util.List;

public class  TestGeneric {


    public static void main(String[] args){
        List<Livro> livroList = new ArrayList<>();
        livroList.add(new Livro("Don Quijote"));
        livroList.add(new Livro("Dom Casmurro"));
        livroList.add(new Livro("el viejo y el pez"));
        ObjetosAlugaveis objetosAlugaveis = new ObjetosAlugaveis(livroList);

        objetosAlugaveis.getObjetosDisponiveis();


    }

}



//TYPE
class ObjetosAlugaveis<T extends Livro>  {


    private List<T> objetosDisponiveis;
    public ObjetosAlugaveis(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }





    public T getObjetosDisponiveis() {
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando: " +t);
        System.out.println("Objetos disponiveis" +objetosDisponiveis);
        return t;
    }

    public void devolverObjeto(T t){
        System.out.println("Devolvendo Objeto: " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos Disponiveis: " + objetosDisponiveis);
    }
}

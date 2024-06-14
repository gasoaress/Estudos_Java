package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }    
    
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            /* Se a descricao da tarefa for igual a descricao que estou passando */
            if(t.getDescricao().equals(descricao)){
                tarefasParaRemover.add(t);/* Se for igual cria uma lista de elemetos a serem removidos*/
            }
            tarefaList.removeAll(tarefasParaRemover);
        }
    }    

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }

}

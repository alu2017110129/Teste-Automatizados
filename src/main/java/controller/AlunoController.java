package controller;

import model.Aluno;
import model.Telefone;
import repository.AlunoRepository;
import repository.ChaveExisteException;
import repository.ChaveInexisteException;
import view.AlunoView;

import java.util.List;


public class AlunoController {


    public void createAluno(String nome, long matricula, int ddd, String numero, char tipo) {
        Aluno aluno = new Aluno(nome, matricula);
        aluno.addFone(new Telefone(ddd,numero,tipo, true,null));
        try {
            AlunoRepository.getInstance().insertAluno(aluno);
        } catch (ChaveExisteException e) {
            System.out.println("chave "+aluno.getMatricula()+" já cadastrada\n");
        }
    }

    public void alteraAluno(Aluno aluno) {
        try {
            AlunoRepository.getInstance().updateAluno(aluno);
        } catch (ChaveInexisteException e) {
            System.out.println(("O Aluno matricula: " + aluno.getMatricula() + "não existe!"));
        }
    }
/*
    public void excluiAluno(Long matricula) {
        try {
            AlunoRepository.getInstance().deleteAluno(matricula);
        } catch () {
            System.out.println(("O Aluno matricula: " + matricula + "não existe!"));
        }
    }*/

    public void listaAlunos() {
        List<Aluno> lista = AlunoRepository.getInstance().buscaTodos();
        AlunoView.listaAlunos(lista);
    }
}

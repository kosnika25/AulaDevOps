package br.com.fatecads.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatecads.demo.entity.Aluno;
import br.com.fatecads.demo.repository.AlunoRepository;

@Service
public class AlunoService {
//Injeção de dependência do repositório de Aluno
    @Autowired
private AlunoRepository alunoRepository;

//metodo para salvar um aluno
public Aluno saveAluno(Aluno aluno) {
    return alunoRepository.save(aluno);
}
//metodo para listar todos os alunos
public List<Aluno> findAll(){
    return alunoRepository.findAll();
}
// metodo para salvar um aluno
public Aluno save(Aluno aluno) {
    return alunoRepository.save(aluno);
}
// metodo para excluir um aluno por id
public void deleteById(Integer id) {
    alunoRepository.deleteById(id);
}
// metodo para encontrar um aluno por id
public Aluno findById(Integer id) {
    return alunoRepository.findById(id).orElse(null);
}


    
}

package com.dmgmodels.lojaRoupas.controller;

import com.dmgmodels.lojaRoupas.dto.DadosAtualizarRoupa;
import com.dmgmodels.lojaRoupas.dto.DadosCadastroRoupa;
import com.dmgmodels.lojaRoupas.model.Roupa;
import com.dmgmodels.lojaRoupas.repository.RoupaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roupa")

public class ControllerProduto {

    @Autowired
    private RoupaRepository roupaRepository;

    @PostMapping
    @Transactional
    public void cadastrarProduto(@RequestBody DadosCadastroRoupa dados)
    {
        roupaRepository.save(new Roupa(dados));
    }

    @GetMapping
    public List<Roupa> listarProduto() {
        return roupaRepository.findAll();
    }

    @GetMapping("/nomeProduto/{nomeProduto}")
    public List<Roupa> listarProdutoEspecifico(@PathVariable String nomeProduto) {
         return roupaRepository.findByNomeProdutoIsContainingIgnoreCase(nomeProduto);
    }

    @DeleteMapping("/deletarProduto/{id}")
    @Transactional
    public void deletarProduto(@PathVariable Long id) {
        roupaRepository.deleteById(id);
    }

    @PutMapping
    @Transactional
    public void atualizarProduto(@RequestBody DadosAtualizarRoupa novosDados) {
        var roupa = roupaRepository.getReferenceById(novosDados.id());
        roupa.atualizarRoupa(novosDados);
        System.out.println(roupa.toString());
    }
}

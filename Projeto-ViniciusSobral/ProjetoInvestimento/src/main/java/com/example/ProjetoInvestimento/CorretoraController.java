package com.example.ProjetoInvestimento;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/investimentos")
public class CorretoraController {

    private List<Investimento> investimento = new ArrayList<Investimento>();

    @GetMapping
    public ResponseEntity getInvestimento(){

        if (investimento.isEmpty()){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.ok().body(investimento);
        }

    }


    @GetMapping("/{id}")
    public ResponseEntity recuperarInvestimento(@PathVariable int id){

        if (investimento.size() >= id){
            return ResponseEntity.ok(investimento.get(id-1));

        } else{
            return ResponseEntity.notFound().build();
        }

    }


    @PostMapping("/{nomeEmpresa}/{tipo}/{valorInvestimento}")
    public ResponseEntity criarInvestimento(@PathVariable String nomeEmpresa, @PathVariable String tipo, @PathVariable Double valorInvestimento){


        if(tipo.equals("fundo")){

            FundoImobiliario fundo = new FundoImobiliario(nomeEmpresa, tipo, valorInvestimento);

            investimento.add(fundo);

            return ResponseEntity.created(null).build();

        } else if (tipo.equals("bolsa")){

            Bolsa bolsa = new Bolsa(nomeEmpresa, tipo, valorInvestimento);

            investimento.add(bolsa);

            return ResponseEntity.created(null).build();

        } else if (tipo.equals("tesouro")){

            TesouroDireto tesouro = new TesouroDireto(nomeEmpresa, tipo, valorInvestimento);

            investimento.add(tesouro);

            return ResponseEntity.created(null).build();

        }

        else{

            return ResponseEntity.noContent().build();
        }

    }



    @DeleteMapping("/{id}")
    public ResponseEntity excluirInvestimento(@PathVariable int id){



        if (investimento.size() >= id){
            investimento.remove(id - 1);
            return ResponseEntity.ok().build();

        } else{

            return ResponseEntity.notFound().build();

        }


    }



    @GetMapping("/altos") // carro inferior a 10 mil
    public List<Investimento> investimentosAltos(){


            List<Investimento> investimentosAltos = investimento.stream().filter(investimento -> investimento.getValorInvestimento() > 1000).collect(Collectors.toList());

            return investimentosAltos;

    }




}

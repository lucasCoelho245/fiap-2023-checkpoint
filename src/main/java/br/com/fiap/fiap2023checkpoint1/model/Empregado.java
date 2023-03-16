package br.com.fiap.fiap2023checkpoint1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Empregado")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Empregado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoEmpregado;

    @Column(name = "nome")
    private String nome;

    @Column(name = "endereco")
    private String endereco;
}

package com.sicredi.comercio.sicredicomercio.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_cliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 230) @NotBlank
    private String nome;

    @Column(nullable = false, length = 11) @NotBlank
    private String cpf;

    @Column(nullable = false, length = 230) @NotBlank
    private String endereco;

    @Column(nullable = false, length = 130) @NotBlank
    private String email;

    //private List<Pedido> pedidos;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.domain;

import lombok.Data;

/**
 *
 * @author grenn
 */
@Data
public class Persona {

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    //Los metodos Setter/Getter no existen, solo son simulados gracias a lombok  @Data
}

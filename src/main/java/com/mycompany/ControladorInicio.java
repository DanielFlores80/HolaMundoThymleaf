/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import com.mycompany.domain.Persona;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author grenn
 */
@Controller
@Slf4j
public class ControladorInicio {
    
    
    //Injecta el valor del archivo de propiedades dentro de la variable "saludo"
    @Value("${index.saludo}")
    private String saludo;
    
    
    //Metodo que mapea la ruta raiz "/" y ejecuta el archivo Vista index.html
    @GetMapping("/")
    public String inicio(Model model){
        var mensaje = "Mensaje con Thymeleaf";
        //Se instancia a la p   ersona 1 y se agregan datos para simular la consulta de una BD
        var persona = new Persona();
        persona.setNombre("Daniel");
        persona.setApellido("Pacheco");
        persona.setEmail("dani_correo@prueba.com");
        persona.setTelefono("1234567890");
        //Se instancia a la persona 1 y se agregan datos para simular la consulta de una BD
        var persona2 = new Persona();
        persona2.setNombre("Antonio");
        persona2.setApellido("Rodriguez");
        persona2.setEmail("toni.rof984@gmail.com");
        persona2.setTelefono("5555666655");
        
        var personasLista = Arrays.asList(persona, persona2);
        /*El modelo guardará el mensaje que se encuentra en el archivo de propiedades con el nombre "mensaje"
         que desde el html obtendrá  */
        model.addAttribute("mensaje", mensaje);
        /*El modelo guardará el mensaje que se encuentra en el archivo de propiedades con el nombre "saludo"
         que desde el html obtendrá  */
        model.addAttribute("saludo", saludo);
        //model.addAttribute("persona", persona);
        model.addAttribute("personasLista", personasLista);
        return "index";
    }
}
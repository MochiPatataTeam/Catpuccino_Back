package com.example.catpuccino_back.dto;

import lombok.Data;

@Data
public class ProductoDTO {
    private Integer id;
    private String nombre;
    private String descripcion;
    private Integer precio;

}
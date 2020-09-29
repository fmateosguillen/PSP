package com.salesianostriana.dam._SpringDataCompletoGrupo2.servicios;

import com.salesianostriana.dam._SpringDataCompletoGrupo2.modelo.Producto;
import com.salesianostriana.dam._SpringDataCompletoGrupo2.repos.ProductoRepositorio;
import com.salesianostriana.dam._SpringDataCompletoGrupo2.servicios.base.ServicioBaseImpl;

import java.util.List;
import java.util.stream.Collectors;

public class ProductoServicio extends ServicioBaseImpl<Producto, Long, ProductoRepositorio>{
    public List<Producto> todosLosProductosConElNombreEnMayusculas() {
        return this.findAll().stream()
                        .map(p -> {
                                Producto.builder()
                                    .id(p.getId()))
                                    .nombre(p.getNombre().toUpperCase())
                                    .precio(p.getPrecio())
                                    .build();
                }).collect(Collectors.toList());
    }
}

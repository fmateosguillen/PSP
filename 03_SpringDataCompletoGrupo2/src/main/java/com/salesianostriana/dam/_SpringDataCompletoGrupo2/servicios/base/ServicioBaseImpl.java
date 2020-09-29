package com.salesianostriana.dam._SpringDataCompletoGrupo2.servicios.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class ServicioBaseImpl<T, ID, R extends JpaRepository<T, ID>> {
    implements ServicioBase<T, ID>{
        @Autowired
        R repositorio;

        public T save(T t){
            return repositorio.save(t);
        }

        public Optional<T> findById(T t){
            return repositorio.findById(id);
        }

        public List<T> findAll(){
            return repositorio.findAll();
        }

        public T edit(T t){
            return repositorio.save(t);
        }

        public void delete(T t) {
            repositorio.delete(t);
        }

    }
}

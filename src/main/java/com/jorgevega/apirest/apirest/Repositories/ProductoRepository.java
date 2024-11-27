package com.jorgevega.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jorgevega.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}

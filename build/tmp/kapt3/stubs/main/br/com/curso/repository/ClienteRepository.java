package br.com.curso.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lbr/com/curso/repository/ClienteRepository;", "Lio/micronaut/data/jpa/repository/JpaRepository;", "Lbr/com/curso/model/Cliente;", "", "entityManager", "Ljavax/persistence/EntityManager;", "(Ljavax/persistence/EntityManager;)V", "findByNome", "Lio/micronaut/data/model/Page;", "nome", "", "pageable", "Lio/micronaut/data/model/Pageable;", "listar", "", "listarComImplementacao", "client-service"})
@io.micronaut.data.annotation.Repository
public abstract class ClienteRepository implements io.micronaut.data.jpa.repository.JpaRepository<br.com.curso.model.Cliente, java.lang.Long> {
    private final javax.persistence.EntityManager entityManager = null;
    
    public ClienteRepository(@org.jetbrains.annotations.NotNull
    javax.persistence.EntityManager entityManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract io.micronaut.data.model.Page<br.com.curso.model.Cliente> findByNome(@org.jetbrains.annotations.NotNull
    java.lang.String nome, @org.jetbrains.annotations.NotNull
    io.micronaut.data.model.Pageable pageable);
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.data.annotation.Query(value = "select c from Cliente c")
    public abstract java.util.List<br.com.curso.model.Cliente> listar();
    
    @org.jetbrains.annotations.NotNull
    @javax.transaction.Transactional
    public java.util.List<br.com.curso.model.Cliente> listarComImplementacao(@org.jetbrains.annotations.Nullable
    java.lang.String nome) {
        return null;
    }
}
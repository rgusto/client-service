package br.com.curso.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lbr/com/curso/service/ClienteService;", "", "clienteRepository", "Lbr/com/curso/repository/ClienteRepository;", "(Lbr/com/curso/repository/ClienteRepository;)V", "create", "Lbr/com/curso/model/Cliente;", "cliente", "delete", "", "id", "", "findAll", "Lio/micronaut/data/model/Page;", "nome", "", "pageable", "Lio/micronaut/data/model/Pageable;", "findById", "listar", "", "update", "client-service"})
@jakarta.inject.Singleton
public class ClienteService {
    private final br.com.curso.repository.ClienteRepository clienteRepository = null;
    
    public ClienteService(@org.jetbrains.annotations.NotNull
    br.com.curso.repository.ClienteRepository clienteRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.curso.model.Cliente create(@org.jetbrains.annotations.NotNull
    br.com.curso.model.Cliente cliente) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.micronaut.data.model.Page<br.com.curso.model.Cliente> findAll(@org.jetbrains.annotations.Nullable
    java.lang.String nome, @org.jetbrains.annotations.NotNull
    io.micronaut.data.model.Pageable pageable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.curso.model.Cliente findById(long id) {
        return null;
    }
    
    public final void delete(long id) {
    }
    
    @javax.transaction.Transactional
    public void update(long id, @org.jetbrains.annotations.NotNull
    br.com.curso.model.Cliente cliente) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<br.com.curso.model.Cliente> listar(@org.jetbrains.annotations.Nullable
    java.lang.String nome) {
        return null;
    }
}
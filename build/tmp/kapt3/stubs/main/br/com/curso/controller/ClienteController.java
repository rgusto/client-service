package br.com.curso.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0012\u0010\u0013\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00152\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u001c\u0010\u0016\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lbr/com/curso/controller/ClienteController;", "", "clienteService", "Lbr/com/curso/service/ClienteService;", "(Lbr/com/curso/service/ClienteService;)V", "create", "Lio/micronaut/http/HttpResponse;", "Lbr/com/curso/model/Cliente;", "cliente", "delete", "", "id", "", "findAll", "Lio/micronaut/data/model/Page;", "nome", "", "pageable", "Lio/micronaut/data/model/Pageable;", "findById", "listar", "", "update", "client-service"})
@io.micronaut.http.annotation.Controller(value = "/clientes")
public class ClienteController {
    private final br.com.curso.service.ClienteService clienteService = null;
    
    public ClienteController(@org.jetbrains.annotations.NotNull
    br.com.curso.service.ClienteService clienteService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Post
    public final io.micronaut.http.HttpResponse<br.com.curso.model.Cliente> create(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Body
    br.com.curso.model.Cliente cliente) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get
    public final io.micronaut.data.model.Page<br.com.curso.model.Cliente> findAll(@org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.QueryValue
    java.lang.String nome, @org.jetbrains.annotations.NotNull
    io.micronaut.data.model.Pageable pageable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(value = "/{id}")
    public final br.com.curso.model.Cliente findById(@io.micronaut.http.annotation.PathVariable
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Delete(value = "/{id}")
    public final io.micronaut.http.HttpResponse<kotlin.Unit> delete(@io.micronaut.http.annotation.PathVariable
    long id) {
        return null;
    }
    
    @javax.transaction.Transactional
    @io.micronaut.http.annotation.Put(value = "/{id}")
    public void update(@io.micronaut.http.annotation.PathVariable
    long id, @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Body
    br.com.curso.model.Cliente cliente) {
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(value = "/pesquisar")
    public final java.util.List<br.com.curso.model.Cliente> listar(@org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.QueryValue
    java.lang.String nome) {
        return null;
    }
}
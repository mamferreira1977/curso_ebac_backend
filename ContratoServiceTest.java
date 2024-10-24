package com.rcosta.service;

import com.rcosta.dao.ContratoDao;
import com.rcosta.dao.impl.ContratoDaoImpl;
import com.rcosta.dao.mocks.ContratoDaoMock;
import org.junit.Assert;
import org.junit.Test;



public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        ContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoServiceImpl(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        ContratoDao dao = new ContratoDaoImpl();
        ContratoService service = new ContratoServiceImpl(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    

    @Test
    public void buscarTest(){
        ContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoServiceImpl(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDeDadosTest() {
        ContratoDao dao = new ContratoDaoImpl();
        ContratoService service = new ContratoServiceImpl(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void excluirTest(){
        ContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoServiceImpl(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirComBancoDeDadosTest() {
        ContratoDao dao = new ContratoDaoImpl();
        ContratoService service = new ContratoServiceImpl(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test
    public void atualizarTest(){
        ContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoServiceImpl(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarComBancoDeDadosTest() {
        ContratoDao dao = new ContratoDaoImpl();
        ContratoService service = new ContratoServiceImpl(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}

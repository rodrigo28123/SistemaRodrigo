/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author PC
 */
public class CompraProduto {
    private int idcompra_produto;
    private int fk_compra;
    private int fk_produto;
    private int quantidade;
    private int valor_unitario;

    /**
     * @return the idcompra_produto
     */
    public int getIdcompra_produto() {
        return idcompra_produto;
    }

    /**
     * @param idcompra_produto the idcompra_produto to set
     */
    public void setIdcompra_produto(int idcompra_produto) {
        this.idcompra_produto = idcompra_produto;
    }

    /**
     * @return the fk_compra
     */
    public int getFk_compra() {
        return fk_compra;
    }

    /**
     * @param fk_compra the fk_compra to set
     */
    public void setFk_compra(int fk_compra) {
        this.fk_compra = fk_compra;
    }

    /**
     * @return the fk_produto
     */
    public int getFk_produto() {
        return fk_produto;
    }

    /**
     * @param fk_produto the fk_produto to set
     */
    public void setFk_produto(int fk_produto) {
        this.fk_produto = fk_produto;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valor_unitario
     */
    public int getValor_unitario() {
        return valor_unitario;
    }

    /**
     * @param valor_unitario the valor_unitario to set
     */
    public void setValor_unitario(int valor_unitario) {
        this.valor_unitario = valor_unitario;
    }
    
    
}

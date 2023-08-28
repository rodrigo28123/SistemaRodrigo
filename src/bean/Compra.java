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
public class Compra {
    private int id_compra;
    private int fk_cliente;
    private String dataDeCompra;
    private int total;
    private int fk_fornecedor;
    private int fk_funcionario;

    /**
     * @return the id_compra
     */
    public int getId_compra() {
        return id_compra;
    }

    /**
     * @param id_compra the id_compra to set
     */
    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    /**
     * @return the fk_cliente
     */
    public int getFk_cliente() {
        return fk_cliente;
    }

    /**
     * @param fk_cliente the fk_cliente to set
     */
    public void setFk_cliente(int fk_cliente) {
        this.fk_cliente = fk_cliente;
    }

    /**
     * @return the dataDeCompra
     */
    public String getDataDeCompra() {
        return dataDeCompra;
    }

    /**
     * @param dataDeCompra the dataDeCompra to set
     */
    public void setDataDeCompra(String dataDeCompra) {
        this.dataDeCompra = dataDeCompra;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the fk_fornecedor
     */
    public int getFk_fornecedor() {
        return fk_fornecedor;
    }

    /**
     * @param fk_fornecedor the fk_fornecedor to set
     */
    public void setFk_fornecedor(int fk_fornecedor) {
        this.fk_fornecedor = fk_fornecedor;
    }

    /**
     * @return the fk_funcionario
     */
    public int getFk_funcionario() {
        return fk_funcionario;
    }

    /**
     * @param fk_funcionario the fk_funcionario to set
     */
    public void setFk_funcionario(int fk_funcionario) {
        this.fk_funcionario = fk_funcionario;
    }

   
    
}

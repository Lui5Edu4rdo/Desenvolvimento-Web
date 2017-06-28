/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoDAO;

import Model.Produto;
import java.util.List;

/**
 *
 * @author Luiz Eduardo
 */
public interface ProdutoDAO {
    public void InserirProduto(Produto produto);
    public List<Produto> listar();
    public void RemoverProduto(Produto produto);
}

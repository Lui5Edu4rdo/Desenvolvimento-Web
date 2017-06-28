package Model;
/**
 *
 * @author Luiz Eduardo
 */
public class Produto {

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the NOME
     */
    public String getNOME() {
        return NOME;
    }

    /**
     * @param NOME the NOME to set
     */
    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    /**
     * @return the PRECO
     */
    public double getPRECO() {
        return PRECO;
    }

    /**
     * @param PRECO the PRECO to set
     */
    public void setPRECO(double PRECO) {
        this.PRECO = PRECO;
    }

    /**
     * @return the UNIDADE
     */
    public String getUNIDADE() {
        return UNIDADE;
    }

    /**
     * @param UNIDADE the UNIDADE to set
     */
    public void setUNIDADE(String UNIDADE) {
        this.UNIDADE = UNIDADE;
    }

    /**
     * @return the QUANTIDADE
     */
    public int getQUANTIDADE() {
        return QUANTIDADE;
    }

    /**
     * @param QUANTIDADE the QUANTIDADE to set
     */
    public void setQUANTIDADE(int QUANTIDADE) {
        this.QUANTIDADE = QUANTIDADE;
    }
    private int ID;
    private String NOME;
    private double PRECO;
    private String UNIDADE;
    private int QUANTIDADE;

   
}

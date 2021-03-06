package br.univali.portugol.nucleo.asa;

/**
 * Representa uma operação de Bitwise OU no código fonte.
 * Esta enumeração representa a operação de <code>Bitwise OU</code> no código fonte e é representada pelo operador "|".
 *
 * @author Luiz Fernando Noschang
 * @version 1.13
 */
public final class NoOperacaoBitwiseOu extends NoOperacao
{
    public NoOperacaoBitwiseOu(NoExpressao operandoEsquerdo, NoExpressao operandoDireito)
    {
        super(operandoEsquerdo, operandoDireito);
    }
    
    /**
     * {@inheritDoc }
     */
    @Override
    public Object aceitar(VisitanteASA visitante) throws ExcecaoVisitaASA
    {
        return visitante.visitar(this);
    }
    
    @Override
    public TipoDado getTipoResultante()
    {
        return TipoDado.INTEIRO;
    }
}

package EstruturaCondicional;
import EstruturaCondicional.ParamUtilizaTEF;

public class FormaPagamento {

    ParamUtilizaTEF paramUtilizaTEF = new ParamUtilizaTEF("NAO");
    private String Constantes = "NAO";
    private boolean formaPagamentoOutrosCartoes = true;
    private boolean formaPagamentoCartaoProprio = false;
    private boolean cancelarVenda = false;
    private boolean isConfirmarVenda = true;
    private boolean vendaExterna = false;
    private boolean nfce = true;

    private boolean vendaInterna = (formaPagamentoOutrosCartoes || formaPagamentoCartaoProprio) &&
            !cancelarVenda && !isConfirmarVenda && !vendaExterna;
    private boolean utilizaTEF = paramUtilizaTEF.getValorString().equals(Constantes.NAO) &&
            !cancelarVenda && isConfirmarVenda && !vendaExterna;
    private boolean vendaExternaCondicao = formaPagamentoOutrosCartoes && vendaExterna && !cancelarVenda;
    private boolean notaFiscal = nfce && formaPagamentoOutrosCartoes;

    public String processarVenda() {
        if (vendaInterna || utilizaTEF || vendaExternaCondicao || notaFiscal) {
            return "venda realizada";
        } else {
            return "venda não realizada";
        }
    }

}

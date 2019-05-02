package MODEL;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class GerenciaXMLCliente {
    
    
    public static ProdutosBEAN arquivoXMLUnico(File arquivo){
        
        ProdutosBEAN lista = null;
        Document documento = null;
        SAXBuilder sax = new SAXBuilder();
        
        try {
            documento = sax.build(arquivo);
        } catch (Exception e) {
            System.err.print("Erro: " + e);
        }

        Element supermarket = documento.getRootElement();
        List<Element> elementos = supermarket.getChildren();

        for (Element element : elementos) {
            
             lista = (new ProdutosBEAN(
            
                    element.getAttributeValue("id"),
                    element.getChildText("Nome"),
                    Double.parseDouble(element.getChildText("preco")),
                    Double.parseDouble(element.getChildText("custo")),
                    Integer.parseInt(element.getChildText("estoqueAtual")),
                    Integer.parseInt(element.getChildText("estoqueMax")),
                    Integer.parseInt(element.getChildText("estoqueMin")),
                    Integer.parseInt(element.getChildText("idCat")),
                    Integer.parseInt(element.getChildText("idUnid")),
                    Integer.parseInt(element.getChildText("idForn"))));
        }
        
        return lista;
    }
    
    public static ArrayList<ProdutosBEAN> arquivoXMLCliente(File arquivo) {

        ArrayList<ProdutosBEAN> lista = new ArrayList<ProdutosBEAN>();

        Document documento = null;
        SAXBuilder sax = new SAXBuilder();

        try {    
        
        documento = sax.build(arquivo);

        Element supermarket = documento.getRootElement();
        List<Element> elementos = supermarket.getChildren();

        for (Element element : elementos) {
            
            lista.add(new ProdutosBEAN(
            
                    element.getAttributeValue("id"),
                    element.getChildText("Nome")
            ));
        };

        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
}

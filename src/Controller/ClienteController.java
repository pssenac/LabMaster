package Controller;

import Models.DAO;
import javax.swing.JOptionPane;

public class ClienteController {

    public String salvarCliente(String nomeCliente, String cpfCliente, String rgCliente,
            String telCliente, String celCliente, String emailCliente,
            String cep, String bairro, String logradouro, String complemento,
            String numero, String cidade, String estado) {

        DAO dao = new DAO();
        dao.cliente.setNomeCliente(nomeCliente);
        dao.cliente.setCpfCliente(cpfCliente);
        dao.cliente.setRgCliente(rgCliente);
        dao.cliente.setTelCliente(telCliente);
        dao.cliente.setCelCliente(celCliente);
        dao.cliente.setEmailCliente(emailCliente);

        dao.endereco.setIdendereco(cidade);
        dao.endereco.setBairro(bairro);
        dao.endereco.setCep(cep);
        dao.endereco.setCidade(cidade);
        dao.endereco.setComplemento(complemento);
        dao.endereco.setEstado(estado);
        dao.endereco.setLogradouro(logradouro);
        dao.endereco.setNumero(numero);

        JOptionPane.showMessageDialog(null, dao.atualizarCliente(DAO.INCLUSAOCLIENTE));
        String msgInclusao = "";
        return msgInclusao;
    }

    public String editarCliente(String idCliente, String idEndereco, String nomeCliente, String cpfCliente, String rgCliente,
            String telCliente, String celCliente, String emailCliente,
            String cep, String bairro, String logradouro, String complemento,
            String numero, String cidade, String estado) {

        DAO dao = new DAO();
        
        dao.cliente.setIdCliente(idCliente);
        dao.cliente.setNomeCliente(nomeCliente);
        dao.cliente.setCpfCliente(cpfCliente);
        dao.cliente.setRgCliente(rgCliente);
        dao.cliente.setTelCliente(telCliente);
        dao.cliente.setCelCliente(celCliente);
        dao.cliente.setEmailCliente(emailCliente);

        dao.endereco.setIdendereco(idEndereco);
        dao.endereco.setBairro(bairro);
        dao.endereco.setCep(cep);
        dao.endereco.setCidade(cidade);
        dao.endereco.setComplemento(complemento);
        dao.endereco.setEstado(estado);
        dao.endereco.setLogradouro(logradouro);
        dao.endereco.setNumero(numero);

        JOptionPane.showMessageDialog(null, dao.atualizarCliente(DAO.ALTERACAOCLIENTE));
        String msgInclusao = "";
        return msgInclusao;
    }

    public boolean verificarEnd(String idendereco) {

        DAO dao = new DAO();
        boolean vffor = true;

        dao.endereco.setIdendereco(idendereco);        
        boolean vf = dao.verificarEnderecoFornecedor(vffor);
        return vf;
    }
}

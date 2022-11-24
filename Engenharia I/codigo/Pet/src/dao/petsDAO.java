package dao;

import java.sql.PreparedStatement;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import modelo.Login;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.petsDTO;

public class petsDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<petsDTO> lista = new ArrayList<>();
        
    
    public ResultSet autenticacao(Login objlogin) {
        conn = new ConnectionFactory().getConnection();

        try {
            String sql = "select * from login where senha = ? and usuario = ?";

            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objlogin.getSenha());
            pstm.setString(2, objlogin.getUsuario());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }

    }

    public void NovoPet(petsDTO objpetsDTO) {

        String sql = "INSERT INTO `pets` (`nome`, `raca`, `idade`, `banho`, `tosa`, `vacina` ) VALUES (?, ?, ?, ?, ?, ?)";

        conn = new ConnectionFactory().getConnection();

        try {

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, objpetsDTO.getNome());
            pstm.setString(2, objpetsDTO.getRaca());
            pstm.setString(3, objpetsDTO.getIdade());
            pstm.setString(4, objpetsDTO.getBanho());
            pstm.setString(5, objpetsDTO.getTosa());
            pstm.setString(6, objpetsDTO.getVacina());
         

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "NovoPet" + erro);
        }

    }
    
    
    

    public ArrayList<petsDTO> listarPets() {

        String sql = "select * from pets ";
        conn = new ConnectionFactory().getConnection();

        try {
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                petsDTO objpets = new petsDTO();
                objpets.setId(rs.getInt("id"));
                objpets.setNome(rs.getString("nome"));
                objpets.setIdade(rs.getString("idade"));
                objpets.setRaca(rs.getString("raca"));
                objpets.setTosa(rs.getString("tosa"));
                objpets.setBanho(rs.getString("banho"));
                objpets.setVacina(rs.getString("vacina"));
                


                lista.add(objpets);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ListarPetsDAO" + erro);
        }
        return lista;
    }
    
    
 public void excluirCadastros(petsDTO objpets){
      String sql = "delete from pets where id = ?";
      conn = new ConnectionFactory().getConnection();
      
      
      try {

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setInt(1, objpets.getId());

            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "cadastrarCanal" + erro);
        }

    }
 
 
 public void alterarCadastro(petsDTO objmedsDTO){
    String sql = "UPDATE `pets` SET nome = ?, raca = ?, idade = ?, banho = ?, tosa = ?, vacina = ? WHERE id = ?";     
   
    conn = new ConnectionFactory().getConnection();
    
    
      try {

           pstm = (PreparedStatement) conn.prepareStatement(sql);
           pstm.setString(1, objmedsDTO.getNome());
           pstm.setString(2, objmedsDTO.getRaca());
           pstm.setString(3, objmedsDTO.getIdade());
           pstm.setString(4, objmedsDTO.getBanho());
           pstm.setString(5, objmedsDTO.getTosa());
           pstm.setString(6, objmedsDTO.getVacina());         
           pstm.setInt(7, objmedsDTO.getId());
            

           pstm.execute();
           pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "AlterarMed" + erro);
        }
 
 }


public Vector  pesquisar(String pesq) throws Exception {
     Vector  tb = new Vector ();
     
     conn = new ConnectionFactory().getConnection();
     String sql = "select * from pets where nome like '" + pesq + "%'";
     PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
     
     
     ResultSet rs = ps.executeQuery();
     while(rs.next()){
         Vector nl = new Vector();
         nl.add(rs.getInt("id"));
         nl.add(rs.getString("nome"));
         nl.add(rs.getString("raca"));
         nl.add(rs.getString("idade"));
         nl.add(rs.getString("banho"));
         nl.add(rs.getString("tosa"));
         nl.add(rs.getString("vacina"));
        
         
         
         tb.add(nl);
         
     }
     return tb;
 }
   


}
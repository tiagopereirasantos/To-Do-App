
package controler;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import model.Project;
import util.ConnectionFactory;


public class ProjectController {
    
    public void save (Project project){
        String sql = "INSERT INTO projects (name,"
                + "description,"
                + "createdAt,"
                + "updatedAt) VALUES (?,?,?,?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdateAt().getTime()));
            
            statement.execute();
                        
        }catch (Exception ex){
            throw new RuntimeException("Erro ao salvar projeto"+ ex.getMessage(), ex);
            
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    } 
    
    public void removeById (int id ){
        String sql = "DELETE FROM projects WHERE id = ?";
                
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.execute();            
        }catch (Exception ex){
            throw new RuntimeException("Erro ao deletar tarefa!"+ ex.getMessage(), ex);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public void update (Project project){
        String sql = "UPDATE projects SET"
                + "name = ?,"
                + "description = ?,"
                + "createdAt = ?,"
                + "updatedAt = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1 , project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdateAt().getTime()));
            statement.execute();
            
        } catch(Exception ex){
            throw new RuntimeException("Erro ao atualizar o projeto"+ex.getMessage(), ex);
        
        }finally{
         ConnectionFactory.closeConnection(connection, statement);   
        }
    }
    
    public List<Task> getAll(int id){
        
    }
    
}

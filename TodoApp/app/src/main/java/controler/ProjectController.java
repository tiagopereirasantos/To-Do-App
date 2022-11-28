
package controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Project;
import util.ConnectionFactory;


public class ProjectController {
    
    public void save (Project project){

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
        
    }
    
    public List<Task> getAll(int id){
        
    }
    
}

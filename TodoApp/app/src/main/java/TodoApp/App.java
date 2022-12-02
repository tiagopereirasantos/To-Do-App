package TodoApp;

import controller.ProjectController;
import java.util.List;
import model.Project;

    public class App{
        
        public static void main(String[] args){
            
              ProjectController projectController = new ProjectController();
              
              Project project = new Project();
                
//            Project project = new Project();
//            project.setName("Projeto teste");
//            project.setDescription("description");
//            projectController.save(project);
                
                project.setId(1);
                project.setDescription("Teste descricao");
                project.setName("Novo nome do projeto");
                projectController.update(project);

                // Cria uma list de projetos e atribui todos projetos que estava no banco de dados
                List<Project> projects = projectController.getAll();
                System.out.println("Total de projetos = " + projects.size());
       
                projectController.removeById(1);
                
                // TESTAR TASKCOTNTROLLER
        }
    }
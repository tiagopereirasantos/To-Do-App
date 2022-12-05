package main;

import controller.ProjectController;
import controller.TaskController;
import java.util.List;
import model.Project;
import model.Task;

    public class App{
        
        public static void main(String[] args){
              
              ProjectController projectController = new ProjectController();
//              dTaskController taskController = new TaskController();
                            
              Project project = new Project();
//              Task task = new Task();
              
              project.setName("Projeto 1");
              project.setDescription("Projeto criado para testar funcionamento do programa");
              projectController.save(project);
              
//              List<Project> projects = projectController.getAll();
//              System.out.println("Total de projetos =" + projects.size());
//              
//              task.setIdProject(3);
//              task.setName("Tarefa 1");
//              task.setDescription("Tarefa criada para testar funcionamento do programa");
//              task.setIsCompleted(false);
//              taskController.save(task);
//              
//              List<Task> tasks = taskController.getAll(3);
//              System.out.println("Total de tarefas: "+ tasks.size());
        }
    }
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package todoApp;

import java.util.Date;
import java.util.List;
import todoApp.controler.ProjectControler;
import todoApp.controler.TaskControler;
import todoApp.model.Project;
import todoApp.model.Task;

public class App {

    public static void main(String[] args) {
        
        ProjectControler projectControler = new ProjectControler();
        
//        Project project = new Project();
//        project.setName("Projeto teste");
//        project.setDescription("description");
//        projectControler.save(project);
        
//        ProjectControler projectControler = new ProjectControler();
//        
//        Project project = new Project();
//        project.setId(1);
//        project.setName("Novo nome de projeto");
//        project.setDescription("description");
//        projectControler.update(project);
        
//        ProjectControler projectControler = new ProjectControler();
//          
//        List<Project> projects = projectControler.getAll();
//        System.out.println("numero de projetos: " + projects.size());

//        ProjectControler projectControler = new ProjectControler();
//        projectControler.deleteProjectById(1);

          TaskControler taskControler = new TaskControler();
          
//          Task task = new Task();
//          task.setName("Do this");
//          task.setIdProject(2);
//          task.setDescription("description");
//          task.setIsCompleted(false);
//          task.setDeadline(new Date());
//          taskControler.save(task);

//          Task task = new Task();
//          task.setId(2);
//          task.setName("Do that");
//          task.setIdProject(2);
//          task.setIsCompleted(false);
//          task.setDeadline(new Date());
//          taskControler.update(task);

//          List<Task> tasks = taskControler.getAll(2);
//          System.out.println("Numero de tarefas: " + tasks.size());

//        taskControler.deleteTaskById(2);
//        taskControler.deleteTaskById(3);

    }
}

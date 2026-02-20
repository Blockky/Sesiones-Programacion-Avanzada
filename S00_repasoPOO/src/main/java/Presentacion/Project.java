package Presentacion;

import java.util.ArrayList;

public class Project {
    
    // Attributes
    private String acronym;
    private double totalBudget;
    private double remainingBudget;
    private ArrayList<Worker> list = new ArrayList<Worker>();
    
    // Constructor
    public Project(String acronym, double totalBudget) {
        this.acronym = acronym;
        this.totalBudget = totalBudget;
        this.remainingBudget = totalBudget;
    }
    
    // Methods
    public void addWorkerToProject(Worker w) {
        if(!list.contains(w))
            list.add(w);
    }
    
    public void updateBudget(Worker w, int hours) {
        System.out.println("---- Updating project budget -----");
        System.out.println(w.toString());
        System.out.println(this.toString());  
        if (list.contains(w)){
            System.out.println("Project budget was updated!");
            remainingBudget -= w.calculateCost(hours);
        }
        else{
            System.out.println("Warning: The worker does not work in that project!");
        } 
    }
    
    public String workerListId() {
        String id = "";
        for(Worker w : list){
            id = id + ";" + w.getId();
        }
        return id;
    }
    
    @Override
    public String toString() {
        return "Project: " + this.acronym + "; Initial budget:" + totalBudget + "; Current budget: " + this.remainingBudget + "\n"
                + "Workers: " + this.workerListId();
    }
 }

/**
 * @author Blocky
 */
public class SystemTest {
    public static void main(String arg[]){
        Programmer p1 =  new Programmer("52441553AS", "Paul J.", "Java");
        Programmer p2 =  new Programmer("52441216RS", "Jonh A.", "C++");
        Designer d1 = new Designer("8569742AG", "Peter T.");
        Project pr1 = new Project("ARC", 50000);
        Project pr2 = new Project("FRS", 32000);
        pr1.addWorkerToProject(p1);
        pr1.addWorkerToProject(p2);
        pr2.addWorkerToProject(d1);
        
        pr1.updateBudget(p1, 5);
        pr1.updateBudget(p2, 8);
        pr2.updateBudget(d1,3);
        
        System.out.println("Number of designers: " + Designer.getDesigners());
        System.out.println("Number of programmers: " + Programmer.getProgrammers());
    }
}

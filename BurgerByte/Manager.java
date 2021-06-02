
/**
 * Write a description of class hmm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;

public class Manager extends Staff {

    public static final double MANAGER_WAGE = 9.50;
    private BurgerByte managingBranch;
    private List<Staff> team;

    public Manager(String name, int age) {
        super(name, age);
        super.age = age;
        super.name = name;
        atWork = false;
        hoursWorked = 0;
        team = new ArrayList<>();
    }
    public List<Staff> getTeam() { return team; }
    public BurgerByte getManagingBranch() { return managingBranch; }
    public void setManagingBranch(BurgerByte managingBranch) {
        this.managingBranch = managingBranch;
    }
    public void hire(Staff e) {
        managingBranch.addStaff(e);
        team.add(e);
        System.out.println("You're hired" + e.getName() + "!");
    }
    public void fire(Staff e) {
        managingBranch.removeStaff(e);
        team.remove(e);
        System.out.println("You're fired " + e.getName() + ".");
    }
}
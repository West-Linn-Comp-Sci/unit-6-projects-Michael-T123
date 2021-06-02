
/**
 * Write a description of class hmm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;

public class BurgerByte {

    private String location;
    private Manager manager;
    private List<Staff> employees;
    private boolean isOpen;

    public BurgerByte(String loca, Manager man) {
        location = loca;
        manager = man;
        employees = new ArrayList<>();
    }
   public List<Staff> getStaff() { return employees; }
   public Manager getManager() { return manager; }
    public String getLocation() { return location; }
    public boolean isOpen() { return isOpen; }
   
    public void addStaff(Staff e) {
        employees.add(e);
    }
     public void computeStaffWages() {
        for (Staff e : employees) {
            System.out.println("Name: " + e.getName() +", Salary: " + e.computeWage());
        }
        System.out.println("Name: " + manager.getName() +", Salary: " + manager.computeWage());
    }
    public void removeStaff(Staff e) {
        employees.remove(e);
    }
     public void openRestaurant() {
        isOpen = true;
    }
    public void closeRestaurant() {
        isOpen = false;
        for (Staff e : employees) {
            e.leaveWork();
        }
        manager.leaveWork();
    }
}
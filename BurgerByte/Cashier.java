
/**
 * Write a description of class hmm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cashier extends Staff {

    public static final double CASHIER_WAGE = 6.50;
    private BurgerByte workBranch;
    private boolean openRegister;

    public Cashier(String name, int age, BurgerByte workBranch) {
        super(name, age);
        super.name = name;
        super.age = age;
        hoursWorked = 0;
        atWork = false;
        this.workBranch = workBranch;
        openRegister = false;
    }
    public BurgerByte getWorkPlace() { return workBranch; }
    public boolean isRegisterOpen() { return openRegister; }
}
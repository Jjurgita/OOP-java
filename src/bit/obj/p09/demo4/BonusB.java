package bit.obj.p09.demo4;

public interface BonusB extends Salary {

    default double getBonus() {
        return getSalary() * 1.20;
    }

}

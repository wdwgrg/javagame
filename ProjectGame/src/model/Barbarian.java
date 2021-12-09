package model;

public class Barbarian extends Model{
    private int power;

    public Barbarian() {
        System.out.println("바바리안이 생성 되었습니다.");
    }

    public Barbarian(int power) {
        super();
        setHp(500);
        setMaxHp(500);
        this.power = power;
    }

    public void attack(Mob mob){
        mob.setHp(mob.getHp() - power);
        System.out.println(mob.getName()+ "을 " + this.power +"만큼 검으로 공격하였습니다.");
    }

    @Override
    public void levelUp() {
        super.levelUp();
        power *= 2;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}

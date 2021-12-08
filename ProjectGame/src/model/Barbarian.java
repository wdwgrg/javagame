package model;

public class Barbarian extends Model{
    private int power;

    public Barbarian() {
        System.out.println("바바리안이 생성 되었습니다.");
    }

    public Barbarian(int power) {
        this.power = power;
    }

    public void attack(){
        System.out.println(this.power +"만큼 주먹으로 공격하였습니다.");
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}

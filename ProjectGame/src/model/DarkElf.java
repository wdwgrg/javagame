package model;

public class DarkElf extends Model{
    private int dex;

    public DarkElf() {
        System.out.println("다크엘프가 생성 되었습니다.");
    }

    public DarkElf(int dex) {
        this.dex = dex;
    }

    public void attack(){
        System.out.println(this.dex +"만큼 화살으로 공격하였습니다.");
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }
}

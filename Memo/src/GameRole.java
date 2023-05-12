public class GameRole {
    private int vitality;
    private int attack;
    private int defense;

    public  void disPlayState(){
        System.out.println("角色当前状态");
        System.out.println("体力：" + this.getVitality());
        System.out.println("攻击力：" + this.getAttack());
        System.out.println("防御力：" + this.getDefense());
        System.out.println();
    }

    public void getInitState(){
        this.vitality = 100;
        this.attack = 100;
        this.defense = 100;
    }

    public void fight(){
        this.vitality = 0;
        this.attack = 0;
        this.defense = 0;
    }
    public RoleStateMemento saveState(){
        return new RoleStateMemento(this.getVitality(),this.getAttack(),this.getDefense());
    }

    public void recoverState(RoleStateMemento memento){
        this.setVitality(memento.getVitality());
        this.setAttack(memento.getAttack());
        this.setDefense(memento.getDefense());
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}

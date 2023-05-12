public class Main {
    public static void main(String[] args) {
        GameRole role = new GameRole();
        role.getInitState();
        role.disPlayState();

        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        stateAdmin.setMemento(role.saveState());

        role.fight();
        role.disPlayState();
        role.recoverState(stateAdmin.getMemento());
        role.disPlayState();
    }

}

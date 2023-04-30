package decorator.wear;

public class Finery implements ICharacter{
    protected ICharacter iCharacter;
    public void decorate(ICharacter iCharacter){
        this.iCharacter = iCharacter;
    }
    @Override
    public void show(){
        if (this.iCharacter != null){
            this.iCharacter.show();
        }
    }
}

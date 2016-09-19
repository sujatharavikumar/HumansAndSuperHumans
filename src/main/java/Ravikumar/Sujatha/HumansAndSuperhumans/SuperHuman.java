package Ravikumar.Sujatha.HumansAndSuperhumans;

/**
 * Created by sujatharavikumar on 9/15/16.
 */
public class SuperHuman extends Human{

    private String heroName;
    private String goodOrBad;
    private String superAbility;

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getGoodOrBad() {
        return goodOrBad;
    }

    public void setGoodOrBad(String goodOrBad) {
        this.goodOrBad = goodOrBad;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

    public void printHeroName(){
        System.out.println("Hero Name:"+getHeroName());
    }

    public void printGoodOrBad(){
        System.out.println("Good Or Bad:"+getGoodOrBad());
    }

    public void printSuperAbility(){
        System.out.println("Super Ability:"+getSuperAbility());
    }


}

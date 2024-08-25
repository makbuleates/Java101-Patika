public class Fighter {
    String name;
    int health;
    int damage;
    int weigh;
    int dodge;

     Fighter(String name, int health, int damage, int weigh, int dodge){
        this.name=name;
        this.health=health;
        this.damage=damage;
        this.weigh=weigh;
        this.dodge=dodge;
    }

    int hit(Fighter foe){
        System.out.println(this.name + " " +  "=>" + foe.damage + " " +  "hasar verdi.");
        if(foe.isDodge()){
            System.out.println(foe.name + " " +  "gelen hasarı blokladı.");
            return foe.health;
        }
        if(foe.health - this.damage < 0){
        return 0;}

        return foe.health - this.damage;
    }

    boolean isDodge(){
    double randomNumber = Math.random()*100;
    return randomNumber<= this.dodge;
    }
}

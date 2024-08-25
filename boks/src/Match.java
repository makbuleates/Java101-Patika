public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match( Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }

    boolean isCheck(){
        return(this.f1.weigh>=this.minWeight && this.f1.weigh<=this.maxWeight)&&(this.f2.weigh>=this.minWeight && this.f2.weigh<=this.maxWeight);
    }

    void start(){
        if(isCheck()) {
            double first = Math.random() * 100;
            System.out.println(first);
            if (first<=50) {
                while (this.f1.health >= 0 && this.f2.health >= 0) {
                    System.out.println("-------YENİ ROUND-------");
                    this.f2.health = this.f1.hit(this.f2);
                    System.out.println(this.f2.name + " " +  "sağlık:" + this.f2.health);
                    System.out.println(this.f1.name + " " +  "sağlık:" + this.f1.health);
                    if (isWin()) {
                        break;
                    }

                this.f1.health = this.f2.hit(this.f1);
                    System.out.println(this.f2.name + " " +  "sağlık:" + this.f2.health);
                    System.out.println(this.f1.name + " " +  "sağlık:" + this.f1.health);
                if (isWin()) {
                    break;}
                }
            } else {
                while (this.f1.health >= 0 && this.f2.health >= 0) {
                    System.out.println("-------YENİ ROUND-------");
                    this.f1.health = this.f2.hit(this.f1);
                    System.out.println(this.f2.name + " " +  "sağlık:" + this.f2.health);
                    System.out.println(this.f1.name + " " +  "sağlık:" + this.f1.health);
                    if (isWin()) {
                        break;
                    }
                    this.f2.health = this.f1.hit(this.f2);
                    System.out.println(this.f2.name + " " + "sağlık:" + this.f2.health);
                    System.out.println(this.f1.name + " " + "sağlık:" + this.f1.health);
                    if (isWin()) {
                        break;
                    }
                }

            }
        }
        else {
            System.out.println("Sporcuların sikletleri uymuyor!");
        }
    }

    boolean isWin(){
        if(this.f1.health==0){
            System.out.println(this.f2.name + " " +  "kazandı!");
            return true;
        }
        if(this.f2.health==0){
            System.out.println(this.f1.name + " " +  "kazandı!");
            return true;
        }

        return false;
    }

}

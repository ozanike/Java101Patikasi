package BoksOyunu;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int whoFirst;


    Fighter(String name, int damage, int health, int weight, int dodge,int whoFirst) {

        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
        this.whoFirst = whoFirst;

    }

    int hit(Fighter rakip) {
        System.out.println(this.name + " => " + rakip.name + " " + this.damage + " hasar vurdu.");


        if (rakip.isDodge()) {
            System.out.println(rakip.name + " gelen hasarını blokladı!");
            return rakip.health;
        }

        if (rakip.health - this.damage < 0) {
            return 0;
        }

        return rakip.health - this.damage;
    }

    boolean isDodge() {
        //random sayı üretmek için kullanıyoruz.
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

    boolean isWhoFirst(){
        //İlk başlayacak oyuncuyu seçme:

        double randomNumber = Math.random() * 100;
        return randomNumber <= this.whoFirst;
    }

}


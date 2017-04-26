/**
 * Created by lennyhicks on 4/25/17.
 */
public class Main {


    public static void main(String[] args){
        Main main = new Main();
        main.run();
    }

    public void run(){
        Nature.Attacker attacker = new Nature.Attacker();
        getStats(attacker);

        Nature.Defender defender = new Nature.Defender();
        getStats(defender);
    }

    public void getStats(Stat stat){
        debug("");

        debug(stat.getClass().getName() + " Stats");
        debug("--------------------------------");
        debug("Attack - " + stat.getAttack());
        debug("Defense - " + stat.getDefense());
        debug("--------------------------------");

    }

    public void debug(String result){
        System.out.println(result);
    }
}

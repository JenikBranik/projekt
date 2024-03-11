import java.util.ArrayList;

public class Farm {

    private ArrayList<Flower> kvetinka;

    public Farm(ArrayList<Flower> kvetinka) {
        kvetinka = new ArrayList<>();
    }

    public void zasadit(){
        if (kvetinka.size()<4){
            kvetinka.add(new Ruze());
        }

    }
    public void zavlazit(){

        for (int i = 0; i>kvetinka.size();i++) {
            kvetinka.get(i).chanceOfGrowth =+ 1;
        }
    }
    public void sklizet(){
        if (kvetinka.size()>0){
            kvetinka.remove(kvetinka.size());
        }
    }
}

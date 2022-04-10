package ch.zhaw.iwi.devops.fizzbuzz;

public class Generationeneinteiler {
    public String generationeneinteiler(int zahl){
        
            if (zahl >=2011){
                return "Generation Alpha";
            }
            else if (zahl >=1997 && zahl <=2010){
                return "Generation Z";
            }
            return "keine bestimmte Generation";
    }
}
package ch.zhaw.iwi.devops.fizzbuzz;

public class Generationeneinteiler {
    public String generationeneinteiler(int zahl){
        
            if (zahl >=2011){
                return "Generation Alpha";
            }
            else if (zahl >=1997 && zahl <=2010){
                return "Generation Z";
            } 
            else if (zahl >=1981 && zahl <=1996){
                return "Generation Y";
            }
            else if (zahl >=1965 && zahl <=1980){
                return "Generation X";
            }
            return "keine bestimmte Generation";
    }
}
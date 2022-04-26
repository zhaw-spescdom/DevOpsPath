package ch.zhaw.iwi.devops.fizzbuzz;
public class Generationeneinteiler {
    public String generationeneinteiler(int zahl){
            int alter = 2022 - zahl;
            System.out.println("Du bist "+alter+" Jahre alt");
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
            else if (zahl >=1946 && zahl <=1964){
                return "Boomer";
            }
            else if (zahl >=1928 && zahl <=1945){
                return "Silent";
            }    
            return "keine bestimmte Generation";
        }   
}
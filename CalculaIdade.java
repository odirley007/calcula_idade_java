
package sysqualificacao;

public class CalculaIdade {
    /*
    metodo que recebe duas datas: a de nascimento e a do sistema
    */
    public int compara(String dataNasc, String dataSist){
        if(comparaMes(dataNasc,dataSist) == 1){
            //System.out.println("ano1: "+(calculaAno(dataNasc,dataSist) - 1));
            return calculaAno(dataNasc,dataSist) - 1;
        } else {
            if(comparaMes(dataNasc,dataSist) == 2 && comparaDia(dataNasc,dataSist) == 1){  
                //System.out.println("ano2: "+(calculaAno(dataNasc,dataSist)));
                return calculaAno(dataNasc,dataSist);                       
            }
        } 
        //System.out.println("ano 3:");
        return calculaAno(dataNasc,dataSist);
    }    
    private int converte(int flag,String dataNasc, String dataSist){
        if (flag == 0){ 
            return Integer.valueOf(dataNasc.replaceAll("/",""));
        }        
        return Integer.valueOf(dataSist.replaceAll("/",""));
    }
    
    private int pegaMes(int flag,String dataNasc, String dataSist ){
       // System.out.println("converte1: "+(converte(flag, dataNasc,dataSist)/10000)%100);
        return (converte(flag, dataNasc,dataSist)/10000)%100;
    }
    
    private int pegaDia(int flag, String dataNasc, String dataSist){
        //System.out.println("converte2: "+(converte(flag, dataNasc, dataSist)/1_000_000));
        return converte(flag, dataNasc, dataSist)/1_000_000;
    }
    
    private int pegaAno(int flag, String dataNasc, String dataSist){
       // System.out.println("converte3: "+(converte(flag, dataNasc, dataSist)%10000));
        return converte(flag, dataNasc, dataSist)%10000;
    }
    
    private int comparaMes(String dataNasc, String dataSist){
        if(pegaMes(0,dataNasc, dataSist) > pegaMes(1, dataNasc, dataSist)){
          //  System.out.println("mes nasc > mes atual");
            return 1;
        }            
        return 2;
    }
    
    private int comparaDia(String dataNasc, String dataSist){
        if(pegaDia(0, dataNasc, dataSist) > pegaDia(1, dataNasc, dataSist)){
            //System.out.println("dia nasc > dia atual");
            return 1;
        }
        return 0;
    }
    
    private int calculaAno(String dataNasc, String dataSist){ 
       // System.out.println("idade: "+(pegaAno(1, dataNasc,dataSist) - pegaAno(0,dataNasc,dataSist)));
        return (pegaAno(1, dataNasc,dataSist) - pegaAno(0,dataNasc,dataSist));
    }
    
}
package app;

import java.time.*;

class Data{
    Integer dia;
    Integer mes;
    Integer ano;

    static String[] meses={
        "janeiro",
        "fevereiro",
        "março",
        "abril",
        "maio",
        "junho",
        "julho",
        "agosto",
        "setembro",
        "outubro",
        "novembro",
        "dezembro"
    };

    public Data(Integer mes, Integer dia, Integer ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public Data(String mes, Integer dia, Integer ano){
        this.dia = dia;
        this.ano = ano;
        for(Integer i=0; i<Data.meses.length; i++){
            if(mes.toLowerCase().equals(Data.meses[i].toLowerCase())){
                this.mes = i+1;
                break;
            }
        }
    }
    public Data(Integer diaDoAno, Integer ano){
        Year y = Year.of(ano);
        LocalDate ld = y.atDay(diaDoAno);
        this.dia = ld.getDayOfMonth();
        this.mes = ld.getMonthValue();
        this.ano = ld.getYear();
    }
    public String toString(){
        return (this.dia + "/" + this.mes + "/" + this.ano);
    }
}
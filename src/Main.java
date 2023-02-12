import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        //declarações
        double[][] notas = {
                {10, 8.5, 5.5, 9.5},
                {8.5, 7, 7.5, 6},
                {8, 9, 10, 7.5},
                {9, 9.5, 10, 8}
        };
        double total = 0;
        double totalPrimeiras = 0;
        String msg = "pos [2][0] : "+notas[2][0]+";\n"+ "pos [3][1] : "+notas[3][1]+";\n";

        //loop para iterar sobre a matriz
        for(int i = 0; i < notas.length; i++){
            for(int j = 0; j < notas[i].length; j++){
                //checa os 4 primeiros itens da iteração atual
                if(j < 4){
                    total += notas[i][j];
                }
                //soma o primeiro elemento de cada iteração
                if(j < 1){
                    totalPrimeiras += notas[i][j];
                }
            }
            //cocatena o total a mensagem original
            msg = msg.concat("total ["+i+"]: "+total)+";\n";
            //zera o total para a proxima iteração
            total = 0;
        }

        msg = msg.concat("total primeiras notas: "+totalPrimeiras)+";\n";


        JOptionPane.showMessageDialog(null, msg);
    }



}
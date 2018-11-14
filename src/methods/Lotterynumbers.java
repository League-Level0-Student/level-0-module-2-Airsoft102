package methods;

import java.sql.Savepoint;
import java.util.Random;

import javax.swing.JOptionPane;

public class Lotterynumbers {
public static void main(String[] args) {
	
Random logi=new Random();

int logit =logi.nextInt(1000001);
System.out.println(logit);


int logite=logi.nextInt(1000001);

int logitec=logi.nextInt(1000001);

int logitech=logi.nextInt(1000001);

int mac=logi.nextInt(1000001);

JOptionPane.showMessageDialog(null,"The lottery nubers are "+logit+","+logite+","+logitec+","+logitech+","+mac);



}






}

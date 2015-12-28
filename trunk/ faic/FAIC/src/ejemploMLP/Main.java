package ejemploMLP;

import java.io.IOException;

import configuration.EnvironmentRNA;

import exceptions.ExceptionWrongParameterClass;


public class Main {
    public static void main(String[] args) throws IOException, ExceptionWrongParameterClass {
    	
    	//el environment setea todo ...dsd la configuracion proporcionada
    	//cambio del 23/01/2013...parametrizar el archivo de entrenamiento
    	EnvironmentRNA env = new EnvironmentRNA("in/config","in/entrenamiento1.csv");
    	env.trainNetwork();
    }
}
package ejemploMorse;

import java.io.IOException;

import configuration.EnvironmentRNA;

import exceptions.ExceptionWrongParameterClass;

import network.ANNTopology;

public class Main {
    public static void main(String[] args) throws IOException, ExceptionWrongParameterClass {
    	
    	
    	EnvironmentRNA env = new EnvironmentRNA("inMorse/config","inMorse/entrenamiento_ordenado.csv");
    	env.trainNetwork();
    	
    	env.testNetwork("inMorse/prueba.csv");
    	env.printNetwork();
    }
}
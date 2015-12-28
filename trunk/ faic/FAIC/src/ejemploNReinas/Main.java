package ejemploNReinas;

import java.io.IOException;

import configuration.EnvironmentGenetic;
import configuration.EnvironmentRNA;

import exceptions.ExceptionWrongParameterClass;

import network.ANNTopology;

public class Main {
    public static void main(String[] args) throws IOException, ExceptionWrongParameterClass {
    	
    	
    	EnvironmentGenetic env = new EnvironmentGenetic("inGeneticNR/config");
    	env.runSolution();
    }
}
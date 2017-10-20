package XORProject;

import java.util.Scanner;

public class Input{
	private final int[] inputArr = new int[2];
	private double[] firstLayerWeights = new double[4];
	private Scanner scan = new Scanner(System.in);

	//takes in a value of 0 or 1
	public void takeInputs(){
		System.out.println("Enter inputs, 0 or 1");
		for(int x = 0; x < 2; x++){
			inputArr[x] = scan.nextInt();
		}
	}

	//biases are random
	public void setupWeights(){
		for(int x = 0; x < 4; x++){
			firstLayerWeights[x] = Math.random()*2-1;
		}
	}

	//returns biases
	public double getFirstLayerWeights(int x){
		return firstLayerWeights[x];
	}

	public int getInputArr(int x){
		return inputArr[x];
	}
}

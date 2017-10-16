public class Hidden{
	private double [] activationVal1 = new double[2];
	private Input obj = new Input();
	private double ws1;
	private double ws2;

	public void calculateActivation(){
		obj.takeInputs();
		obj.setupWeights();

		ws1 = (obj.getFirstLayerWeights(0)*obj.getInputArr(0))+(obj.getFirstLayerWeights(1)*obj.getInputArr(1))-2;
		ws2 = (obj.getFirstLayerWeights(2)*obj.getInputArr(0))+(obj.getFirstLayerWeights(3)*obj.getInputArr(1))+7;
		activationVal1[0] = sigmoid(ws1);
		activationVal1[1] = sigmoid(ws2);
		System.out.println(activationVal1[0]);
		System.out.println(activationVal1[1]);
	}

	public double sigmoid(double x){
		return 1/(1+(Math.pow(Math.E,-x)));
	}

	public static void main(String[] args){
		Hidden ob = new Hidden();
		ob.calculateActivation();
	}
}

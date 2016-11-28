package edu.elon.math;

public class Controller implements ControllerInterface {
	
private ModelInterface model;
private View view;

	public Controller(ModelInterface model){
		this.model = model;
		view = new View(this,model);
		view.createView();
	}
}

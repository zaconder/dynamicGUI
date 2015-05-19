package dynamicGUI.view;

import javax.swing.JFrame;

import dynamicGUI.controller.DynamicController;

public class DynamicFrame extends JFrame
{
	
	private DynamicPanel basePanel;
	
	public DynamicFrame(DynamicController baseController)
	{
		basePanel = new DynamicPanel(baseController);
		
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(1000, 600);
		this.setResizable(false);
		setVisible(true);
	}
}

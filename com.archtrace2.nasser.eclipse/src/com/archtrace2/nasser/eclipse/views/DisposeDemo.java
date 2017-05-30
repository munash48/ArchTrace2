package com.archtrace2.nasser.eclipse.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class DisposeDemo {
	  private static void addControls(final Shell shell) {
	    shell.setLayout(new GridLayout());
	    Button button = new Button(shell, SWT.PUSH);
	    button.setText("Click to remove all controls from shell");
	    button.addSelectionListener(new SelectionListener() {
	    
	      @Override public void widgetSelected(SelectionEvent event) {
	        for (Control kid : shell.getChildren()) {
	          kid.dispose();
	        }
	        for (int i = 0; i < 5; i++) {
  		      Label label = new Label(shell, SWT.NONE);
  		      label.setText("Hello, World!");
  		    }
	      }
	      @Override public void widgetDefaultSelected(SelectionEvent event) {
	    	  
	    	 
	    	  
	      }
	
	    });
	 
	    shell.pack();
	  }

	  public static void main(String[] args) {
	    Display display = new Display();
	    Shell shell = new Shell(display);
	    addControls(shell);
	    shell.open();
	    while (!shell.isDisposed()) {
	      if (!display.readAndDispatch()) {
	        display.sleep();
	      }
	    }
	    display.dispose();
	  }
	}
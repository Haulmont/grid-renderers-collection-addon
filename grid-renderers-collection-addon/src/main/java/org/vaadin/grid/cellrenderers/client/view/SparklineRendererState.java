package org.vaadin.grid.cellrenderers.client.view;

import com.vaadin.shared.ui.grid.renderers.AbstractRendererState;

public class SparklineRendererState extends AbstractRendererState {
	public int width = 75;
	public int height = 16;
	public int pathWidth = 1;
	
	public String caption;
	
	public String pathColor = "#999";
	public String valueColor = "#69f";
	public String normalRangeColor = "#ddd";
	public String averageColor = "#aaa";
	public String minmaxColor = valueColor;
	
	public boolean normalRangeVisible = false;
	public boolean averageVisible = false;
	public boolean valueVisible = false;
	public boolean minmaxVisible = false;
	public boolean minmaxDotsVisible = false;
	public boolean valueDotVisible = false;
}

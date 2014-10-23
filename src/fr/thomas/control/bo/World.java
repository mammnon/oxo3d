package fr.thomas.control.bo;

import java.util.ArrayList;
import java.util.List;

public class World {
	public List<Plot> allPlot;
	
	public World() {
		allPlot = new ArrayList<Plot>(16);
		for (int i = 1; i < 5; i++) {
			allPlot.add(new Plot("plot" + i + "A"));
			allPlot.add(new Plot("plot" + i + "B"));
			allPlot.add(new Plot("plot" + i + "C"));
			allPlot.add(new Plot("plot" + i + "D"));
		}
	}

	private Plot retrievePlot(String lastMove) {
		Plot result = null;
		for (int i = 0; i < 16 && result == null; i++) {
			if (allPlot.get(i).name.compareTo(lastMove) == 0) {
				result = allPlot.get(i);
			}
		}
		return result;
	}

	
	public String addTorus(String id, String lastMove) { // return the high of
															// the torus
		Plot plot = retrievePlot(lastMove);
		if (plot != null) {
			if (plot.h1 == null) {
				plot.h1 = id;
				return "1";
			} else if (plot.h2 == null) {
				plot.h2 = id;
				return "2";
			} else if (plot.h3 == null) {
				plot.h3 = id;
				return "3";
			} else if (plot.h4 == null) {
				plot.h4 = id;
				return "4";
			}

		}
		return "-1";
	}

	public class Plot {
		public String name;
		public String h1;
		public String h2;
		public String h3;
		public String h4;

		public Plot(String title) {
			this.name = title;
		}
	}
}

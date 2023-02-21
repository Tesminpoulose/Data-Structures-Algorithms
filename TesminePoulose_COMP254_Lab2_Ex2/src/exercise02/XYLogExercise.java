package exercise02;

import java.awt.Color;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class XYLogExercise extends ApplicationFrame{

	   
	    public XYLogExercise(final String title) {

	        super(title);

	        final XYSeries s1 = new XYSeries("Prefix Average 1");
	        final XYSeries s2 = new XYSeries("Prefix Average 2");
	        
	        int n=10;
	        for (int i = 1; i <= 5; i++) 
	        {
	            s1.add(Math.pow(n, i), PrefixAverage.PreAvgTime1( Math.pow(n, i)));
	            s2.add(Math.pow(n, i), PrefixAverage.PreAvgTime2( Math.pow(n, i)) );
	        }

	        final XYSeriesCollection ds = new XYSeriesCollection();
	        ds.addSeries(s1);
	        ds.addSeries(s2);

	        final JFreeChart chart = ChartFactory.createXYLineChart(
	            "Prefix Average Exercise",     // chart title 
	            "Category",               // domain axis label
	            "Value",                  // range axis label
	            ds,                  // data
	            PlotOrientation.VERTICAL,
	            true,                     
	            true,
	            false
	        );

	        final XYPlot graph = chart.getXYPlot();
	        final NumberAxis domainAxis = new LogarithmicAxis("Log(N)");
	        final NumberAxis rangeAxis = new LogarithmicAxis("Log(Time)");
	        graph.setDomainAxis(domainAxis);
	        graph.setRangeAxis(rangeAxis);
	        chart.setBackgroundPaint(Color.lightGray);
	        graph.setOutlinePaint(Color.white);
	        final ChartPanel chartPanel = new ChartPanel(chart);
	        chartPanel.setPreferredSize(new java.awt.Dimension(700, 500));
	        setContentPane(chartPanel);
	    }
	    
	   
	    public static void main(final String[] args) {
	    	System.gc();
	        final XYLogExercise ex = new XYLogExercise("XY Log Axes Exercise");
	        ex.pack();
	        RefineryUtilities.centerFrameOnScreen(ex);
	        ex.setVisible(true);
	    }
	}


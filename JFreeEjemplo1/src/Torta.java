import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Torta {
	
	public static void main(String[] args) {
		// create a dataset...
		DefaultPieDataset data = new DefaultPieDataset();
		data.setValue("Categoria 1", 43.2);
		data.setValue("Categoria 2", 27.9);
		data.setValue("Categoria 3", 79.5);
		// create a chart...
		JFreeChart chart = ChartFactory.createPieChart(
		"Sample Pie Chart",
		data,
		true, // legend?
		true, // tooltips?
		false // URLs?
		);
		// create and display a frame...
		ChartFrame frame = new ChartFrame("Proporción de Venta", chart);
		frame.pack();
		frame.setVisible(true);
		}
}

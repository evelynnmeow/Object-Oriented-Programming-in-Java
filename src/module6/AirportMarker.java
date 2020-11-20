package module6;

import java.util.List;

import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.SimpleLinesMarker;
import processing.core.PGraphics;

/** 
 * A class to represent AirportMarkers on a world map.
 *   
 * @author Adam Setters and the UC San Diego Intermediate Software Development
 * MOOC team
 *
 */
public class AirportMarker extends CommonMarker {
	public static List<SimpleLinesMarker> routes;
	
	public AirportMarker(Feature city) {
		super(((PointFeature)city).getLocation(), city.getProperties());
	
	}
	
	public String getCountry() {
		return (String) getProperty("Country");
	}
	
	public float getMagnitude() {
		return Float.parseFloat(getProperty("altitude").toString());
	}
	
	public String getCity() {
		return (String) getProperty("city");
	}
	
	public String getName() {
		return (String) getProperty("name");
	}
	
	public String getCode() {
		return (String) getProperty("code");	
		
	}
	
	public float getRadius() {
		return Float.parseFloat(getProperty("radius").toString());
	}
	
	
	public void draw (PGraphics pg, float x, float y) {
		if (!hidden) {
			drawMarker(pg, x, y);
			if (selected) {
				showTitle(pg, x, y);
			}
		}
	}
	
	@Override
	public void drawMarker(PGraphics pg, float x, float y) {
		float magnitude = this.getMagnitude();
		if(magnitude >5000 && magnitude  <= 8000){
			pg.fill(255,0,0);
			pg.ellipse(x, y, 5, 5);
		}else if(magnitude>8000 && magnitude<=10000){
			pg.fill(255,255,0);
			pg.ellipse(x, y, 5, 5);
		}else if(magnitude>10000){
			pg.fill(0,0,255);
			pg.ellipse(x, y, 5, 5);
		}
		
		
	}

	@Override
	public void showTitle(PGraphics pg, float x, float y) {
		 // show rectangle with title
		String title = this.getCity() + " " + this.getCode() + " " + this.getMagnitude();
		pg.text(title, x, y);
		
		// show routes
		
		
	}
	public static void setRoutes(List<SimpleLinesMarker> routes) {
		AirportMarker.routes = routes;
	}
	
}

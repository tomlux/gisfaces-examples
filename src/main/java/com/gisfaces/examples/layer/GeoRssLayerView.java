package com.gisfaces.examples.layer;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.gisfaces.examples.map.MapView;
import com.gisfaces.model.layer.GeoRSSLayer;

@Named
@SessionScoped
public class GeoRssLayerView extends MapView implements Serializable
{
	private static final long serialVersionUID = 6680927620368200395L;

	@PostConstruct
	public void init()
	{
		super.init();

		// Build a map layer.
		GeoRSSLayer layer = new GeoRSSLayer();
		layer.setId("wyoming");
		layer.setTitle("Wyoming");
		layer.setUrl("https://esri.box.com/shared/static/ko99d42udctfv8z0ja2j6dz6q5tzbzu4.xml");

		// Initialize the map view.
		this.setLatitude(43.138893);
		this.setLongitude(-107.689363);
		this.setZoom(6);
		this.getModel().getLayers().add(layer);
	}
}
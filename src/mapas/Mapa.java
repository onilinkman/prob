/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapas;

import com.teamdev.jxmaps.swing.MapView;
import com.teamdev.jxmaps.*;
import javax.swing.JFrame;
/**
 *
 * @author Scion
 */
public class Mapa extends MapView {
    
    private Map map;
    
    public Mapa(){
        JFrame frame=new JFrame();
        setOnMapReadyHandler(new MapReadyHandler() {
            @Override
            public void onMapReady(MapStatus ms) {
                if(ms==MapStatus.MAP_STATUS_OK){
                    map=getMap();
                    MapOptions mapOptions=new MapOptions();
                    MapTypeControlOptions controlOptions=new MapTypeControlOptions();
                    mapOptions.setMapTypeControlOptions(controlOptions);
                    
                    map.setOptions(mapOptions);
                    map.setCenter(new LatLng(-54.231, 105.542));
                    map.setZoom(11.0);
                }
            }
        });
        frame.add(this);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
    
    
}

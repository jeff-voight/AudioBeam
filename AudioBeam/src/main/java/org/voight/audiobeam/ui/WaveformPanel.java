/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.voight.audiobeam.ui;

import java.util.List;
import javax.swing.JPanel;
import org.voight.audiobeam.audio.Waveform;

/**
 *
 * @author Jeffrey Voight <jeff.voight@gmail.com>
 */
public class WaveformPanel extends JPanel {
    private static final int MAXWAVES=5, MINWAVES=0;
    
    private List<Waveform> waveforms;
    
    public void paint(Graphics g){
        
    }


    public List<Waveform> add(Waveform _waveform){
        if(waveforms.size()<MAXWAVES){
            waveforms.add(_waveform);
        }
        return waveforms;
    }
    
    public List<Waveform> remove(Waveform _waveform){
        if(waveforms.size()>MINWAVES){
            waveforms.remove(_waveform);
        }
        return waveforms;
    }
}

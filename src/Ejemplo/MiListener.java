package Ejemplo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiListener implements ActionListener {

    MiComponenteAWT componenteAWT;
    public MiListener(MiComponenteAWT componenteAWT){
        this.componenteAWT = componenteAWT;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        componenteAWT.dispose();
    }
}

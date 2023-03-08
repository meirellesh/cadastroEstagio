/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class EmailComboBoxModel extends AbstractListModel implements ComboBoxModel {

    private List<String> listaEmail;
    private String emailSelecionado;

    public EmailComboBoxModel() {
        this.listaEmail = new ArrayList<>();
    }

    public int getSize() {
        return listaEmail.size();
    }

    @Override
    public Object getElementAt(int index) {
        return this.listaEmail.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        if (anItem instanceof String) {

            this.emailSelecionado = (String) anItem;
            fireContentsChanged(this.listaEmail, 0, this.listaEmail.size());
        }
    }

    @Override
    public Object getSelectedItem() {
        return this.emailSelecionado;
    }

    
    public void addEmail(String email){
        this.listaEmail.add(email);
        
    }
    
    public void reset(){
        this.listaEmail.clear();
    }
}
